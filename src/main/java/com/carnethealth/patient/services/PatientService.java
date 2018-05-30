package com.carnethealth.patient.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.Patient;
import com.carnethealth.patient.repository.PatientRepository;

@Service
@Transactional
public class PatientService {
	
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public Iterable<Patient> geAllPatient(){
        return  patientRepository.findAll();
    }
    
    public Optional<Patient> getPatientById(Long id){
        return patientRepository.findById(id);
    }
    
    public Patient getPatientByCarnetId(String carnetId){
        return patientRepository.findAllByCarnetId(carnetId);
    }
    
    public Patient updatePatient(Patient patient){
        return patientRepository.save(patient);
    }
    
    public void deleteCarnetIDGenerator(Long id){
    	patientRepository.deleteById(id);
    }

}
