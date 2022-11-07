package com.woodyside.new_york_times.rabbitmq;

import com.woodyside.new_york_times.dto.NewsYorkTimesNewsDto;
import com.woodyside.new_york_times.service.NewYorkTimesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class NewsConsumer {

    private final NewYorkTimesService newYorkTimesService;

    @RabbitListener(queues = "${rabbitmq.queues.notification}")
    public void consumeNewsForCNN(NewsYorkTimesNewsDto newsDto) {
        log.info("Consumed news {} from queue", newsDto);
        newYorkTimesService.saveNews(newsDto);
    }
}
