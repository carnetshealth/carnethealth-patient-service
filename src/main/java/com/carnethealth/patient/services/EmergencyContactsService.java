package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.EmergencyContacts;
import com.carnethealth.patient.repository.EmergencyContactsRepository;

@Service
@Transactional
public class EmergencyContactsService {
	
	@Autowired
	private EmergencyContactsRepository emergencyContactsRepository;
	
	public EmergencyContacts createEmergencyContacts(EmergencyContacts emergencyContacts) {
		return emergencyContactsRepository.save(emergencyContacts);
	}
	
	public List<EmergencyContacts> geAllEmergencyContacts(){
        return emergencyContactsRepository.findAll();
    }
    
    public Optional<EmergencyContacts> getEmergencyContactsById(Long id){
        return emergencyContactsRepository.findById(id);
    }
    
    public EmergencyContacts updateEmergencyContacts(EmergencyContacts emergencyContacts){
        return emergencyContactsRepository.save(emergencyContacts);
    }
    
    public void deleteEmergencyContacts(Long id){
    	emergencyContactsRepository.deleteById(id);
    }
}
