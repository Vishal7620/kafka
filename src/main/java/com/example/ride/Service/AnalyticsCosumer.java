package com.example.ride.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.ride.Model.RideEvent;

@Service
public class AnalyticsCosumer {
   
    @KafkaListener(topics = "ride-events" , groupId = "analytics")
    public void analysis(RideEvent message)
    {
       System.out.println("📊 Analytics: Received ride event -> " + message);
    }

    @KafkaListener(topics = "ride-events" ,groupId="notification-consumer")
    public void notify(RideEvent rideEvent)
    {
          System.out.println("📢 Notification: Driver & User notified -> " + rideEvent);
    }

    @KafkaListener(topics = "ride-events", groupId = "storage-consumer")
    public void storage(RideEvent rideEvent)
    {
         System.out.println("💾 Storage: Ride saved to DB -> " + rideEvent);
    }

}
