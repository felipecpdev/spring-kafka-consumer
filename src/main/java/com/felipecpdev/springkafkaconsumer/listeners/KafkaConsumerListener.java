package com.felipecpdev.springkafkaconsumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"test-topic"}, groupId = "my-group-id")
    public void listener(String message) {
        logger.info("Mensaje Recibido: " + message);
        //aqui puedo comunicar a un service de este microservicio o otra acción
    }
}
