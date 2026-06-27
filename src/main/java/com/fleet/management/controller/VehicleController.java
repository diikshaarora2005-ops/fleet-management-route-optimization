package com.fleet.management.controller;

import org.springframework.web.bind.annotation.RestController;
import com.fleet.management.service.VehicleService;
import com.fleet.management.entity.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class VehicleController {
	private final VehicleService vehicleService;
	public VehicleController(VehicleService vehicleService) {
	    this.vehicleService = vehicleService;
	}
	@PostMapping("/vehicles")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
	    return vehicleService.saveVehicle(vehicle);
	}

}