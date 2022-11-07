package com.woodyside.new_york_times.config;

import lombok.Getter;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class MessageBrokerNewsConfig {

    @Value(value = "${rabbitmq.exchanges.internal}")
    private String internalExchange;

    @Value(value = "${rabbitmq.queues.notification}")
    private String notificationQueue;

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(this.internalExchange);
    }

    @Bean
    public Queue newsQueue() {
        return new Queue(this.notificationQueue, false);
    }

    @Bean
    public Binding newsBinding() {
        return BindingBuilder
                .bind(newsQueue())
                .to(fanoutExchange());
    }
}
