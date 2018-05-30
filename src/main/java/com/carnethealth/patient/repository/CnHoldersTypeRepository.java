package com.carnethealth.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carnethealth.patient.carnetid.CnHoldersType;

@Repository
public interface CnHoldersTypeRepository extends JpaRepository<CnHoldersType, Long> {

}
