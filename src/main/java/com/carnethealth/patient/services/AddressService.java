package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.model.Address;
import com.carnethealth.patient.repository.AddressRepository;

@Service
@Transactional
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}
	
	public List<Address> geAllAddress(){
        return addressRepository.findAll();
    }
    
    public Optional<Address> getAddressById(Long id){
        return addressRepository.findById(id);
    }
    
    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }
    
    public void deleteAddress(Long id){
    	addressRepository.deleteById(id);
    }
}
