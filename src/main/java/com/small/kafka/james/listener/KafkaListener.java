package com.small.kafka.james.listener;


import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "food",
            groupId = "group1"
    )
    void iamListening(String data){
        System.out.println("I am listening from @kafka KafkaListener " + data);
    }

}
