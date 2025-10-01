package com.example.ride.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.ride.Model.RideEvent;
import com.example.ride.Repository.RideRepository;

@Service
public class AnalyticsCosumer {
   
    @Autowired
    RideRepository rideRepository;
    
    @KafkaListener(topics = "ride-events" , groupId = "analytics")
    public void analysis(RideEvent rideEvent)
    {
       System.out.println("📊 Analytics: Received ride event -> " + rideEvent);
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
