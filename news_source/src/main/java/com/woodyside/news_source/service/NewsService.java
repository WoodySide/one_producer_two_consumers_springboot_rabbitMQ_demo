package com.woodyside.news_source.service;

import com.woodyside.amqp.RabbitMQMessageProducer;
import com.woodyside.news_source.dto.NewsDto;
import com.woodyside.news_source.model.News;
import com.woodyside.news_source.repository.NewsRepository;
import com.woodyside.news_source.util.NewsModelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final NewsRepository newsRepository;

    private final RabbitMQMessageProducer messageProducer;

    public NewsDto publishNews(NewsDto toBePublished) {

        News news = NewsModelMapper.dtoToModel(toBePublished);

        newsRepository.save(news);

        messageProducer.publish(toBePublished,"fanout.exchange",
                "internal.notification.routing-key");

        return NewsModelMapper.modelToDto(news);
    }
}
