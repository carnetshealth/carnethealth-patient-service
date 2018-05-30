package com.carnethealth.patient.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnethealth.patient.carnetid.CarnetIDGenerator;
import com.carnethealth.patient.repository.CarnetIDGeneratorRepository;

@Service
@Transactional
public class CarnetIDGeneratorService {
	
	@Autowired
	private CarnetIDGeneratorRepository carnetIDGeneratorRepository;
	
	public CarnetIDGenerator createCarnetIDGenerator(CarnetIDGenerator carnetIDGenerator) {
		return carnetIDGeneratorRepository.save(carnetIDGenerator);

	}
	
	public List<CarnetIDGenerator> geAllCarnetIDGenerator(){
        return carnetIDGeneratorRepository.findAll();
    }
    
    public Optional<CarnetIDGenerator> getCarnetIDGeneratorById(Long id){
        return carnetIDGeneratorRepository.findById(id);
    }
    
    public CarnetIDGenerator updateCarnetIDGenerator(CarnetIDGenerator carnetIDGenerator){
        return carnetIDGeneratorRepository.save(carnetIDGenerator);
    }
    
    public void deleteCarnetIDGenerator(Long id){
    	carnetIDGeneratorRepository.deleteById(id);
    }

}
