package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.model.EmergencyContacts;

@Repository
public interface EmergencyContactsRepository extends JpaRepository<EmergencyContacts, Long>{

}
