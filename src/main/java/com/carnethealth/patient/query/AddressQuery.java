package com.carnethealth.patient.query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carnethealth.patient.model.Address;
import com.carnethealth.patient.services.AddressService;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class AddressQuery {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	AddressService addressService ;

    @GraphQLQuery(name = "patientAddressByCarnetId")
    public Address getAddress(@GraphQLArgument(name = "carnetId") String carnetId){    	

    	return addressService.getPatientAddressByCarnetId(carnetId);
    }

}
