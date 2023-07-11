package com.example.config;


import com.example.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;



@Component
public class MessageListener {
    @Autowired
    SimpMessagingTemplate template;

    @KafkaListener(
            topics = "#{'${kafka.topic}'.split(',')}",
            groupId = "temp-groupid.group"
    )
    public void listen(Message message) {
        System.out.println("sending via kafka listener..");

        template.convertAndSend("/topic/group", message);
    }
}