package com.AutoGarage.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AutoGarage.com.Cars.CarDetails;
import com.AutoGarage.com.Repository.CarRepository;
import com.AutoGarage.com.Service.CarService;





@RestController
public class CarController {
	@Autowired
	private CarService carService;
	
	@PostMapping("/addCarDetails")
	public CarDetails addCarDetails(@RequestBody CarDetails carDetails) {
		return carService.createCarDetails(carDetails);
	}
	
	@PostMapping("/addCarDetailsp")
	public List<CarDetails> addCarDetails(@RequestBody List<CarDetails> carDetails) {
		return carService.createCarDetails(carDetails);
	}
	@GetMapping("/carDetails/{cid}")
	public CarDetails getaddCarDetailsById(@PathVariable int cid) {
		return carService.getCarDetailsByCid(cid);
	}
	
	@GetMapping("/carDetails")
	public List<CarDetails> getAllCarDetails() {
		return carService.getCarDetails();
	}
	
	@DeleteMapping("/carDetails/{cid}")
	public String deleteCarDetails(@PathVariable int cid) {
		return carService.deleteCarDetailsByCid(cid);
	}
	
}
