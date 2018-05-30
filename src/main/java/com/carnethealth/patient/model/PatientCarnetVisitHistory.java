package com.carnethealth.patient.model;

import java.io.Serializable;
import java.sql.Date;

public class PatientCarnetVisitHistory implements Serializable{
	
	private int patient_visit_id;
	private int patient_id;
	private int institution_id;
	private int provider_id;
	private String diagnostics;
	private Date diagnotic_date;
	private String diagnostic_service;
	private float  diagnostic_fees;
	private String diagnostic_fees_status;
	private Date diagnostic_service_date;
	
	public PatientCarnetVisitHistory() {}
	
	public PatientCarnetVisitHistory(int patient_visit_id, int patient_id, int institution_id, int provider_id,
			String diagnostics, Date diagnotic_date, String diagnostic_service, float diagnostic_fees,
			String diagnostic_fees_status, Date diagnostic_service_date) {
		super();
		this.patient_visit_id = patient_visit_id;
		this.patient_id = patient_id;
		this.institution_id = institution_id;
		this.provider_id = provider_id;
		this.diagnostics = diagnostics;
		this.diagnotic_date = diagnotic_date;
		this.diagnostic_service = diagnostic_service;
		this.diagnostic_fees = diagnostic_fees;
		this.diagnostic_fees_status = diagnostic_fees_status;
		this.diagnostic_service_date = diagnostic_service_date;
	}

	/**
	 * @return the patient_visit_id
	 */
	public int getPatient_visit_id() {
		return patient_visit_id;
	}

	/**
	 * @param patient_visit_id the patient_visit_id to set
	 */
	public void setPatient_visit_id(int patient_visit_id) {
		this.patient_visit_id = patient_visit_id;
	}

	/**
	 * @return the patient_id
	 */
	public int getPatient_id() {
		return patient_id;
	}

	/**
	 * @param patient_id the patient_id to set
	 */
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	/**
	 * @return the institution_id
	 */
	public int getInstitution_id() {
		return institution_id;
	}

	/**
	 * @param institution_id the institution_id to set
	 */
	public void setInstitution_id(int institution_id) {
		this.institution_id = institution_id;
	}

	/**
	 * @return the provider_id
	 */
	public int getProvider_id() {
		return provider_id;
	}

	/**
	 * @param provider_id the provider_id to set
	 */
	public void setProvider_id(int provider_id) {
		this.provider_id = provider_id;
	}

	/**
	 * @return the diagnostics
	 */
	public String getDiagnostics() {
		return diagnostics;
	}

	/**
	 * @param diagnostics the diagnostics to set
	 */
	public void setDiagnostics(String diagnostics) {
		this.diagnostics = diagnostics;
	}

	/**
	 * @return the diagnotic_date
	 */
	public Date getDiagnotic_date() {
		return diagnotic_date;
	}

	/**
	 * @param diagnotic_date the diagnotic_date to set
	 */
	public void setDiagnotic_date(Date diagnotic_date) {
		this.diagnotic_date = diagnotic_date;
	}

	/**
	 * @return the diagnostic_service
	 */
	public String getDiagnostic_service() {
		return diagnostic_service;
	}

	/**
	 * @param diagnostic_service the diagnostic_service to set
	 */
	public void setDiagnostic_service(String diagnostic_service) {
		this.diagnostic_service = diagnostic_service;
	}

	/**
	 * @return the diagnostic_fees
	 */
	public float getDiagnostic_fees() {
		return diagnostic_fees;
	}

	/**
	 * @param diagnostic_fees the diagnostic_fees to set
	 */
	public void setDiagnostic_fees(float diagnostic_fees) {
		this.diagnostic_fees = diagnostic_fees;
	}

	/**
	 * @return the diagnostic_fees_status
	 */
	public String getDiagnostic_fees_status() {
		return diagnostic_fees_status;
	}

	/**
	 * @param diagnostic_fees_status the diagnostic_fees_status to set
	 */
	public void setDiagnostic_fees_status(String diagnostic_fees_status) {
		this.diagnostic_fees_status = diagnostic_fees_status;
	}

	/**
	 * @return the diagnostic_service_date
	 */
	public Date getDiagnostic_service_date() {
		return diagnostic_service_date;
	}

	/**
	 * @param diagnostic_service_date the diagnostic_service_date to set
	 */
	public void setDiagnostic_service_date(Date diagnostic_service_date) {
		this.diagnostic_service_date = diagnostic_service_date;
	}

}
