package com.example.ride.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ride.Model.RideEvent;
import com.example.ride.Service.ProducerService;

@RestController
@RequestMapping("/produce")
public class RideController {
    
    @Autowired
    private ProducerService producerService;

    @PostMapping("/bookRide")
    public String bookRide(@RequestBody RideEvent event)
    {
       producerService.sendEvent(event);
       return "Ride is booked";
    }
}
