package com.small.kafka.james.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.retrytopic.RetryTopicConfigurationBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    public NewTopic newTopicCreate(){
        return TopicBuilder.name("food").build();
    }
}
