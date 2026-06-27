
package com.fleet.management.service;

import org.springframework.stereotype.Service;
import com.fleet.management.repository.VehicleRepository;
import com.fleet.management.entity.Vehicle;
import com.fleet.management.dto.VehicleDto;
import java.util.List;
import java.util.Optional;

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
	public List<Vehicle> getAllVehicles() {
	    return vehicleRepository.findAll();
	}
	public Optional<Vehicle> getVehicleById(Long id) {
	    return vehicleRepository.findById(id);
	}

}