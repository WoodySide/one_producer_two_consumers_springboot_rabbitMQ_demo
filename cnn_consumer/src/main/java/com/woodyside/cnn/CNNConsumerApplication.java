package com.woodyside.cnn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.woodyside.news_source",
        "com.woodyside.amqp",
        "com.woodyside.cnn"
})
public class CNNConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CNNConsumerApplication.class, args);
    }
}
