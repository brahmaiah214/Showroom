package com.AutoGarage.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AutoGarage.com.Cars.CarDetails;


public interface CarRepository extends JpaRepository<CarDetails, Integer> {

}
