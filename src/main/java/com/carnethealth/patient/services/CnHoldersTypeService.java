package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.carnetid.CnHoldersType;
import com.carnethealth.patient.repository.CnHoldersTypeRepository;

@Service
@Transactional
public class CnHoldersTypeService {
	
	@Autowired
	private CnHoldersTypeRepository cnHoldersTypeRepository;
	
	public CnHoldersType createCnHoldersType(CnHoldersType cnHoldersType) {
		return cnHoldersTypeRepository.save(cnHoldersType);

	}
	
	public List<CnHoldersType> geAllCnHoldersType(){
        return cnHoldersTypeRepository.findAll();
    }
    
    public Optional<CnHoldersType> getCnHoldersTypeById(Long id){
        return cnHoldersTypeRepository.findById(id);
    }
    
    public CnHoldersType updateCnHoldersType(CnHoldersType cnHoldersType){
        return cnHoldersTypeRepository.save(cnHoldersType);
    }
    
    public void deleteCnHoldersType(Long id){
    	cnHoldersTypeRepository.deleteById(id);
    }
}
