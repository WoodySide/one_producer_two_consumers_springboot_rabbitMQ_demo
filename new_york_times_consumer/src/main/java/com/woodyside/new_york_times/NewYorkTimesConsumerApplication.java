package com.woodyside.new_york_times;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.woodyside.amqp",
        "com.woodyside.new_york_times"
})
public class NewYorkTimesConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewYorkTimesConsumerApplication.class, args);
    }
}
