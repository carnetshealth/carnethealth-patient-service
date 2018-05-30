package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.model.LoginCredentials;

@Repository
public interface LoginCredentialsRepository  extends JpaRepository<LoginCredentials, Long>{

}
