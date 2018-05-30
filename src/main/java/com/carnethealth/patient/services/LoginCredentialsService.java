package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.LoginCredentials;
import com.carnethealth.patient.repository.LoginCredentialsRepository;

@Service
@Transactional
public class LoginCredentialsService {
	@Autowired
	private LoginCredentialsRepository loginCredentialsRepository;
	
	public LoginCredentials createAddress(LoginCredentials loginCredentials) {
		return loginCredentialsRepository.save(loginCredentials);
	}
	
	public List<LoginCredentials> geAllAddress(){
        return loginCredentialsRepository.findAll();
    }
    
    public Optional<LoginCredentials> getAddressById(Long id){
        return loginCredentialsRepository.findById(id);
    }
    
    public LoginCredentials updateAddress(LoginCredentials loginCredentials){
        return loginCredentialsRepository.save(loginCredentials);
    }
    
    public void deleteAddress(Long id){
    	loginCredentialsRepository.deleteById(id);
    }
}
