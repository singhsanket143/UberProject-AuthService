package com.example.uberprojectauthservice.repositories;

import com.example.uberprojectauthservice.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
