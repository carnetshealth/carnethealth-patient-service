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
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class PatientQuery {

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
      // final Optional<Patient> searchResult = this.mockPatient.stream()
      //          .filter(patient -> patient.getCarnet_id().equals(carnetId))
       //         .findFirst();        
      //  return searchResult.orElseThrow(()->new RuntimeException("Patient not found"));
    	return patientService.getPatientByCarnetId(carnetId);
    }
    
    /* Example of inseting new id mutation {
    	  createPatient(patient: {firstName: "loupo", lastName: "tony", phoneNumber: "234-56-7890", category: "PATIENT", email: "email@gmail.com", nationalIdNumber: "CM1009283", patientStatus: "actif", guardianNin: "CM13435598", address: {street: "nkomo", city: "yaounde", regionState: "centre", country: "CMR"}, emergencyContacts: {emFirstName: "pierre", emLastName: "paul", emPhoneNumber: "345-567-9012"}}) {
    	    firstName  lastName  carnetId birthDate  phoneNumber category email nationalIdNumber patientStatus guardianNin registrationDate
    	    address { street city regionState country
    	    } emergencyContacts { emFirstName emLastName  emPhoneNumber }  } }*/
    
    @GraphQLMutation(name = "createPatient")
    public Patient createPatient(@GraphQLArgument(name = "patient") Patient patient){          	
    	return patientService.createPatient(patient);
      }

}
