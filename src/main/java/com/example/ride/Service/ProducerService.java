package com.example.ride.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.ride.Model.RideEvent;

@Service
public class ProducerService {
    
    @Autowired
    private KafkaTemplate<String,RideEvent> kafkaTemplate;
    
    private static final String TOPIC="ride-events";
    public void sendEvent( RideEvent event)
    {
            kafkaTemplate.send(TOPIC, event);
         System.out.println("🚕 Produced: " + event);
    }
}
