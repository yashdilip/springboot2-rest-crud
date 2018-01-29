package com.code.assessment.Springboot2restfulcrudapi.service;

import java.util.List;
import java.util.Optional;

import com.code.assessment.Springboot2restfulcrudapi.entity.Vehicle;

public interface IVehicleService {
	public List<Vehicle> getAllVehicles();
	public Optional<Vehicle> getVehicleById(Long id);
	public Vehicle saveVehicle(Vehicle vehicle);
	public Vehicle updateVehicle(Vehicle vehicle);
	public void deleteVehicleById(Long id);	
}
