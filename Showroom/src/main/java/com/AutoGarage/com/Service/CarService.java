package com.AutoGarage.com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AutoGarage.com.Cars.CarDetails;
import com.AutoGarage.com.Repository.CarRepository;



@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	
	
	public CarDetails createCarDetails(CarDetails carDetails) {
		return carRepository.save(carDetails);
	}

	public List<CarDetails> createCarDetails(List<CarDetails> carDetails) {
		return carRepository.saveAll(carDetails);
	}

	public CarDetails getCarDetailsByCid(int cid) {
		return carRepository.findById(cid).orElse(null);
	}

	public List<CarDetails> getCarDetails() {
		return carRepository.findAll();
	}
	
	
	public String deleteCarDetailsByCid(int cid) {
		carRepository.deleteById(cid);
		return "User got deleted";
	}
	
}
