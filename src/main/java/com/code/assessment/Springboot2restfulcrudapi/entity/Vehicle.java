package com.code.assessment.Springboot2restfulcrudapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private Long year;
	private String make;
	private String model;
	public Vehicle() {
	}
	public Vehicle(Long id, Long year, String make, String model) {
		this.id = id;
		this.year = year;
		this.make = make;
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + "]";
	}
}
