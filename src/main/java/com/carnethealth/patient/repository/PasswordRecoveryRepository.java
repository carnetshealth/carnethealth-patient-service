package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.model.PasswordRecovery;

@Repository
public interface PasswordRecoveryRepository extends JpaRepository<PasswordRecovery, Long>{

}
