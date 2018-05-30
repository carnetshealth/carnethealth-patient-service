package com.carnethealth.patient.model;

import java.io.Serializable;

public class Payments implements Serializable{
	
	private int transaction_id;
	private int provider;
	private int patient_carnethealth_saving_id;
	private int patient_visit_id;
	
	public Payments() {}
	
	public Payments(int transaction_id, int provider, int patient_carnethealth_saving_id, int patient_visit_id) {
		super();
		this.transaction_id = transaction_id;
		this.provider = provider;
		this.patient_carnethealth_saving_id = patient_carnethealth_saving_id;
		this.patient_visit_id = patient_visit_id;
	}

	/**
	 * @return the transaction_id
	 */
	public int getTransaction_id() {
		return transaction_id;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the provider
	 */
	public int getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(int provider) {
		this.provider = provider;
	}

	/**
	 * @return the patient_carnethealth_saving_id
	 */
	public int getPatient_carnethealth_saving_id() {
		return patient_carnethealth_saving_id;
	}

	/**
	 * @param patient_carnethealth_saving_id the patient_carnethealth_saving_id to set
	 */
	public void setPatient_carnethealth_saving_id(int patient_carnethealth_saving_id) {
		this.patient_carnethealth_saving_id = patient_carnethealth_saving_id;
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
 
}
