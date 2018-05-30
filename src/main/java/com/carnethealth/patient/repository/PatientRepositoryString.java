package com.carnethealth.patient.repository;

import java.util.List;
import java.util.Optional;

import com.carnethealth.patient.model.Patient;

//@Repository
public interface PatientRepositoryString /*extends CrudRepository<Patient, Long>*/{
	
	List<Patient> findAllByPatientCarnetId(String first);
	

}