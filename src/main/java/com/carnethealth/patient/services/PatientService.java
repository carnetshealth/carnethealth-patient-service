package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.Patient;
import com.carnethealth.patient.repository.PatientRepository;
import com.carnethealth.patient.repository.PatientRepositoryString;

@Service
@Transactional
public class PatientService {
	
	
	//private PatientRepositoryString patientRepositoryString;
	
	@Autowired
	private PatientRepository patientRepository;
	
	/*@Autowired
	public PatientService (PatientRepositoryString patientRepositoryString) {
		this.patientRepositoryString = patientRepositoryString;
	}*/
	
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
