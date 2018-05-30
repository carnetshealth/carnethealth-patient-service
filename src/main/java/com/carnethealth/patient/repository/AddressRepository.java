package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
