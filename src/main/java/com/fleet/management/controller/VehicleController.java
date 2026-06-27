package com.fleet.management.controller;

import org.springframework.web.bind.annotation.RestController;
import com.fleet.management.service.VehicleService;
import com.fleet.management.entity.Vehicle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;

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
	@GetMapping("/vehicles")
	public List<Vehicle> getAllVehicles() {
	    return vehicleService.getAllVehicles();
	}
	@GetMapping("/vehicles/{id}")
	public Optional<Vehicle> getVehicleById(@PathVariable Long id) {
	    return vehicleService.getVehicleById(id);
	}

}