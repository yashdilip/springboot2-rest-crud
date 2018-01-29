package com.code.assessment.Springboot2restfulcrudapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.assessment.Springboot2restfulcrudapi.entity.Vehicle;
import com.code.assessment.Springboot2restfulcrudapi.repository.IVehicleRepository;

@Service
public class VehicleService implements IVehicleService {
	@Autowired
	private IVehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleRepository.findAll();
	}

	@Override
	public Optional<Vehicle> getVehicleById(Long id) {
		Optional<Vehicle> vehicle = vehicleRepository.findById(id);
		if(!vehicle.isPresent()) {
			return Optional.empty();
		}
		return vehicle;
	}

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteVehicleById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
