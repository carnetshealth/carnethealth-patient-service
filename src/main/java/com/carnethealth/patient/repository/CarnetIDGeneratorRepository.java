package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.carnetid.CarnetIDGenerator;

@Repository
public interface CarnetIDGeneratorRepository extends JpaRepository<CarnetIDGenerator, Long>{

}
