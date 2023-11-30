package com.blit.controller;

public class CarController {
	
	public CarService carService;
	
	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	@Getmapping
	public List<Car>getAllCars();
	return carService.getAllCars();
}

public ResponseEntity addCar(@RequestBody Car car) {
	carService.addCar(car);
	return ResponseEntity.status (201).build();
}