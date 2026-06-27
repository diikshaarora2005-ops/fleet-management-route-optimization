
package com.fleet.management.service;

import org.springframework.stereotype.Service;
import com.fleet.management.repository.VehicleRepository;
import com.fleet.management.entity.Vehicle;
import com.fleet.management.dto.VehicleDto;

@Service
public class VehicleService {
	private final VehicleRepository vehicleRepository;
	public VehicleService(VehicleRepository vehicleRepository) {
	    this.vehicleRepository = vehicleRepository;
	}
	public VehicleDto convertToDto(Vehicle vehicle) {

	    VehicleDto dto = new VehicleDto();

	    dto.setVehicleNumber(vehicle.getVehicleNumber());
	    dto.setVehicleType(vehicle.getVehicleType());
	    dto.setDriverName(vehicle.getDriverName());
	    dto.setCapacity(vehicle.getCapacity());

	    return dto;
	}
	public Vehicle saveVehicle(Vehicle vehicle) {
	    return vehicleRepository.save(vehicle);
	}

}