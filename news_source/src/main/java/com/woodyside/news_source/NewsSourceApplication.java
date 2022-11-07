package com.woodyside.news_source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.woodyside.amqp",
                "com.woodyside.news_source"
        }
)
public class NewsSourceApplication {
    public static void main(String[] args) {

        SpringApplication.run(NewsSourceApplication.class, args);
    }
}
