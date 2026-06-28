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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

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
	@PutMapping("/vehicles/{id}")
	public Vehicle updateVehicle(@PathVariable Long id, @RequestBody Vehicle vehicle) {
	    return vehicleService.updateVehicle(id, vehicle);
	}
	@DeleteMapping("/vehicles/{id}")
	public void deleteVehicle(@PathVariable Long id) {
	    vehicleService.deleteVehicle(id);
	}

}