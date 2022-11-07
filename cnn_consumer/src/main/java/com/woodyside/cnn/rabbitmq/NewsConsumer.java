package com.woodyside.cnn.rabbitmq;

import com.woodyside.cnn.dto.CNNNewsDto;
import com.woodyside.cnn.service.CNNNewsService;
import com.woodyside.news_source.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NewsConsumer {

    private final CNNNewsService cnnNewsService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumeNewsForCNN(CNNNewsDto cnnNewsDto) {
        log.info("Consumed news {} from queue", cnnNewsDto);
        cnnNewsService.saveNews(cnnNewsDto);
    }
}
