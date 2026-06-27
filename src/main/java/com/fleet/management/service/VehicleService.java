
package com.fleet.management.service;

import org.springframework.stereotype.Service;
import com.fleet.management.repository.VehicleRepository;
import com.fleet.management.entity.Vehicle;

@Service
public class VehicleService {
	private final VehicleRepository vehicleRepository;
	public VehicleService(VehicleRepository vehicleRepository) {
	    this.vehicleRepository = vehicleRepository;
	}
	public Vehicle saveVehicle(Vehicle vehicle) {
	    return vehicleRepository.save(vehicle);
	}

}