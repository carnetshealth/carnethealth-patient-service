package com.carnethealth.patient.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.model.Patient;

@Repository
public interface PatientRepository extends PagingAndSortingRepository <Patient, Long>{
	
	Patient findAllByCarnetId(String first);

}
