package com.carnethealth.patient.model;

import java.io.Serializable;
import java.sql.Date;

public class DiagnosticProfessionalsComments implements Serializable{
		
	private int patient_health_visit_id;
	private int provider_id;
	private String diagnostic_comment;
	private Date diagnostic_comment_date;
	
	public DiagnosticProfessionalsComments() {}
	
	public DiagnosticProfessionalsComments(int patient_health_visit_id, int provider_id, String diagnostic_comment,
			Date diagnostic_comment_date) {
		super();
		this.patient_health_visit_id = patient_health_visit_id;
		this.provider_id = provider_id;
		this.diagnostic_comment = diagnostic_comment;
		this.diagnostic_comment_date = diagnostic_comment_date;
	}

	/**
	 * @return the patient_health_visit_id
	 */
	public int getPatient_health_visit_id() {
		return patient_health_visit_id;
	}

	/**
	 * @param patient_health_visit_id the patient_health_visit_id to set
	 */
	public void setPatient_health_visit_id(int patient_health_visit_id) {
		this.patient_health_visit_id = patient_health_visit_id;
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
	 * @return the diagnostic_comment
	 */
	public String getDiagnostic_comment() {
		return diagnostic_comment;
	}

	/**
	 * @param diagnostic_comment the diagnostic_comment to set
	 */
	public void setDiagnostic_comment(String diagnostic_comment) {
		this.diagnostic_comment = diagnostic_comment;
	}

	/**
	 * @return the diagnostic_comment_date
	 */
	public Date getDiagnostic_comment_date() {
		return diagnostic_comment_date;
	}

	/**
	 * @param diagnostic_comment_date the diagnostic_comment_date to set
	 */
	public void setDiagnostic_comment_date(Date diagnostic_comment_date) {
		this.diagnostic_comment_date = diagnostic_comment_date;
	}

}
