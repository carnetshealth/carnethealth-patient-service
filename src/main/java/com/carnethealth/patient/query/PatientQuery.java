package com.carnethealth.patient.query;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carnethealth.patient.model.Patient;
import com.carnethealth.patient.services.PatientService;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class PatientQuery {
	
	List<Patient> mockPatient;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PatientService patientService ;
	
	/**
     * Retrieve existing patient by carnetid.
     * Invoke after you get an id from the createVendor mutation.
     *
     * Invoke with
     * {patientBycarnetId(carnetid:"P1001CM"){name,address{postalCode}}}
     *
     * @param carnetid
     * @return
     */
    @GraphQLQuery(name = "patientBycarnetId")
    public Patient getPatient(@GraphQLArgument(name = "carnetId") String carnetId){
    	
    	System.out.println(" *************************** "+ carnetId +" *************************** ");
    	logger.info("Patient id 10001 -> {}", patientService.getPatientByCarnetId(carnetId));
    	System.out.println(" *************************** "+ carnetId +" *************************** ");
    	
      // final Optional<Patient> searchResult = this.mockPatient.stream()
      //          .filter(patient -> patient.getCarnet_id().equals(carnetId))
       //         .findFirst();        
      //  return searchResult.orElseThrow(()->new RuntimeException("Patient not found"));
    	return patientService.getPatientByCarnetId(carnetId);
    }

}
