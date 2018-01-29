package com.code.assessment.Springboot2restfulcrudapi.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.code.assessment.Springboot2restfulcrudapi.entity.Vehicle;
import com.code.assessment.Springboot2restfulcrudapi.service.IVehicleService;

@RestController
public class VehicleController {
	@Autowired
	private IVehicleService vehicleService;
	
	@GetMapping("/vehicles")
	public List<Vehicle> getAllVehicles(){
		return vehicleService.getAllVehicles();
	}
	
	@GetMapping("/vehicles/{id}")
	public ResponseEntity<Vehicle> getVehicleById(@PathVariable long id){
		return  vehicleService.getVehicleById(id)
				.map(result -> new ResponseEntity<>(result, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping("/vehicles")
	public ResponseEntity<Vehicle> saveVehicle(@RequestBody Vehicle vehicle){
		System.out.println("i am here "+vehicle.toString());

		Vehicle savedVehicle = vehicleService.saveVehicle(vehicle);
		if(savedVehicle == null) {
			return new ResponseEntity<Vehicle>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Vehicle>(savedVehicle, HttpStatus.OK);
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
//				.buildAndExpand(savedVehicle.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
	}
}
