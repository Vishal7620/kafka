package com.example.ride.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ride.Model.RideEvent;

public interface RideRepository extends JpaRepository<RideEvent,Long>{
    
}
