package com.small.kafka.james;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectsApplication.class, args);
    }


    @Bean
    CommandLineRunner commandRunner (KafkaTemplate<String, String> kafkaTemplate){

        return args -> {
            // send  <topic, data>
            for (int i = 0; i < 20; i++) {
                kafkaTemplate.send("food", "sweet potato  " + i);
            }

        };
    }
}
