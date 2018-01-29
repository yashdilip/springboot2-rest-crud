package com.code.assessment.Springboot2restfulcrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.code.assessment.Springboot2restfulcrudapi.entity.Vehicle;

@Repository
@Transactional
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {

}
