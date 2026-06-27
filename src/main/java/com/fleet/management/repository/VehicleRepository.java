package com.fleet.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fleet.management.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}