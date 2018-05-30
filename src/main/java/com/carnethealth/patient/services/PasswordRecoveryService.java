package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.PasswordRecovery;
import com.carnethealth.patient.repository.PasswordRecoveryRepository;

@Service
@Transactional
public class PasswordRecoveryService {
	
	@Autowired
	private PasswordRecoveryRepository passwordRecoveryRepository;
	
	public PasswordRecovery createAddress(PasswordRecovery passwordRecovery) {
		return passwordRecoveryRepository.save(passwordRecovery);
	}
	
	public List<PasswordRecovery> geAllAddress(){
        return passwordRecoveryRepository.findAll();
    }
    
    public Optional<PasswordRecovery> getAddressById(Long id){
        return passwordRecoveryRepository.findById(id);
    }
    
    public PasswordRecovery updateAddress(PasswordRecovery passwordRecovery){
        return passwordRecoveryRepository.save(passwordRecovery);
    }
    
    public void deleteAddress(Long id){
    	passwordRecoveryRepository.deleteById(id);
    }
}
