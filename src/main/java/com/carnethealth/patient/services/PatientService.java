package com.carnethealth.patient.services;

import java.sql.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.carnetid.CarnetIDGenerator;
import com.carnethealth.patient.carnetid.CnHoldersType;
import com.carnethealth.patient.model.Patient;
import com.carnethealth.patient.repository.CarnetIDGeneratorRepository;
import com.carnethealth.patient.repository.CnHoldersTypeRepository;
import com.carnethealth.patient.repository.PatientRepository;

@Service
@Transactional
public class PatientService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	CarnetIDGeneratorRepository carnetIDGeneratorRepository;
	
	@Autowired
	CnHoldersTypeRepository CnHoldersTypeRepository;
	
	CarnetIDGenerator carnetIDGenerator = new CarnetIDGenerator();
	CnHoldersType cnHoldersType = new CnHoldersType();
	
	public Patient createPatient(Patient patient) {
		logger.info("Patient to Uper -> {}", patient.getCategory().toUpperCase());
		cnHoldersType = CnHoldersTypeRepository.findAllByCnHoldeDefinition(patient.getCategory().toUpperCase());
		
		carnetIDGenerator = carnetIDGeneratorRepository.save(new CarnetIDGenerator(cnHoldersType.getCn_holder_type(), patient.getAddress().get(0).getCountry()));
		
		patient.setCarnetId(cnHoldersType.getCn_holder_type() + carnetIDGenerator.getId()+patient.getAddress().get(0).getCountry());
		
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
