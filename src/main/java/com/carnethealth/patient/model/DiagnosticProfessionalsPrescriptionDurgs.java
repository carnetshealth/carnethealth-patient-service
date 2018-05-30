package com.carnethealth.patient.model;

import java.io.Serializable;
import java.sql.Date;

public class DiagnosticProfessionalsPrescriptionDurgs implements Serializable{

	private int patient_health_history_id;
	private int provider_id;
	private String diagnostic_prescrition;
	private Date diagnostic_prescription_date ;
	private Date expiration_date_prescription;
	private float dosage_per_day;
	private float amount_dispensed;
	private float period_days;
	private boolean food_required;
	
	public DiagnosticProfessionalsPrescriptionDurgs() {}
	
	public DiagnosticProfessionalsPrescriptionDurgs(int patient_health_history_id, int provider_id,
			String diagnostic_prescrition, Date diagnostic_prescription_date, Date expiration_date_prescription,
			float dosage_per_day, float amount_dispensed, float period_days, boolean food_required) {
		super();
		this.patient_health_history_id = patient_health_history_id;
		this.provider_id = provider_id;
		this.diagnostic_prescrition = diagnostic_prescrition;
		this.diagnostic_prescription_date = diagnostic_prescription_date;
		this.expiration_date_prescription = expiration_date_prescription;
		this.dosage_per_day = dosage_per_day;
		this.amount_dispensed = amount_dispensed;
		this.period_days = period_days;
		this.food_required = food_required;
	}

	/**
	 * @return the patient_health_history_id
	 */
	public int getPatient_health_history_id() {
		return patient_health_history_id;
	}

	/**
	 * @param patient_health_history_id the patient_health_history_id to set
	 */
	public void setPatient_health_history_id(int patient_health_history_id) {
		this.patient_health_history_id = patient_health_history_id;
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
	 * @return the diagnostic_prescrition
	 */
	public String getDiagnostic_prescrition() {
		return diagnostic_prescrition;
	}

	/**
	 * @param diagnostic_prescrition the diagnostic_prescrition to set
	 */
	public void setDiagnostic_prescrition(String diagnostic_prescrition) {
		this.diagnostic_prescrition = diagnostic_prescrition;
	}

	/**
	 * @return the diagnostic_prescription_date
	 */
	public Date getDiagnostic_prescription_date() {
		return diagnostic_prescription_date;
	}

	/**
	 * @param diagnostic_prescription_date the diagnostic_prescription_date to set
	 */
	public void setDiagnostic_prescription_date(Date diagnostic_prescription_date) {
		this.diagnostic_prescription_date = diagnostic_prescription_date;
	}

	/**
	 * @return the expiration_date_prescription
	 */
	public Date getExpiration_date_prescription() {
		return expiration_date_prescription;
	}

	/**
	 * @param expiration_date_prescription the expiration_date_prescription to set
	 */
	public void setExpiration_date_prescription(Date expiration_date_prescription) {
		this.expiration_date_prescription = expiration_date_prescription;
	}

	/**
	 * @return the dosage_per_day
	 */
	public float getDosage_per_day() {
		return dosage_per_day;
	}

	/**
	 * @param dosage_per_day the dosage_per_day to set
	 */
	public void setDosage_per_day(float dosage_per_day) {
		this.dosage_per_day = dosage_per_day;
	}

	/**
	 * @return the amount_dispensed
	 */
	public float getAmount_dispensed() {
		return amount_dispensed;
	}

	/**
	 * @param amount_dispensed the amount_dispensed to set
	 */
	public void setAmount_dispensed(float amount_dispensed) {
		this.amount_dispensed = amount_dispensed;
	}

	/**
	 * @return the period_days
	 */
	public float getPeriod_days() {
		return period_days;
	}

	/**
	 * @param period_days the period_days to set
	 */
	public void setPeriod_days(float period_days) {
		this.period_days = period_days;
	}

	/**
	 * @return the food_required
	 */
	public boolean isFood_required() {
		return food_required;
	}

	/**
	 * @param food_required the food_required to set
	 */
	public void setFood_required(boolean food_required) {
		this.food_required = food_required;
	}
	
		
}
