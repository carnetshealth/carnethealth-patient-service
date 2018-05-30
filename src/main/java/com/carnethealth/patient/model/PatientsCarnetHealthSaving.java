package com.carnethealth.patient.model;

import java.io.Serializable;
import java.sql.Date;

public class PatientsCarnetHealthSaving implements Serializable{
	
	private int patient_carnethealth_saving_id;
	private int patient_id;
	private float pa_deposit;
	private float pa_deposit_amount;
	private Date pa_deposit_date;
	private float pa_redraw_money;
	private float pa_redraw_amount;
	private float pa_redraw_date;
	private float pa_balance_amount;
	private Date pa_balance_date;
	
	public PatientsCarnetHealthSaving() {}
	
	public PatientsCarnetHealthSaving(int patient_carnethealth_saving_id, int patient_id, float pa_deposit,
			float pa_deposit_amount, Date pa_deposit_date, float pa_redraw_money, float pa_redraw_amount,
			float pa_redraw_date, float pa_balance_amount, Date pa_balance_date) {
		super();
		this.patient_carnethealth_saving_id = patient_carnethealth_saving_id;
		this.patient_id = patient_id;
		this.pa_deposit = pa_deposit;
		this.pa_deposit_amount = pa_deposit_amount;
		this.pa_deposit_date = pa_deposit_date;
		this.pa_redraw_money = pa_redraw_money;
		this.pa_redraw_amount = pa_redraw_amount;
		this.pa_redraw_date = pa_redraw_date;
		this.pa_balance_amount = pa_balance_amount;
		this.pa_balance_date = pa_balance_date;
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
	 * @return the pa_deposit
	 */
	public float getPa_deposit() {
		return pa_deposit;
	}

	/**
	 * @param pa_deposit the pa_deposit to set
	 */
	public void setPa_deposit(float pa_deposit) {
		this.pa_deposit = pa_deposit;
	}

	/**
	 * @return the pa_deposit_amount
	 */
	public float getPa_deposit_amount() {
		return pa_deposit_amount;
	}

	/**
	 * @param pa_deposit_amount the pa_deposit_amount to set
	 */
	public void setPa_deposit_amount(float pa_deposit_amount) {
		this.pa_deposit_amount = pa_deposit_amount;
	}

	/**
	 * @return the pa_deposit_date
	 */
	public Date getPa_deposit_date() {
		return pa_deposit_date;
	}

	/**
	 * @param pa_deposit_date the pa_deposit_date to set
	 */
	public void setPa_deposit_date(Date pa_deposit_date) {
		this.pa_deposit_date = pa_deposit_date;
	}

	/**
	 * @return the pa_redraw_money
	 */
	public float getPa_redraw_money() {
		return pa_redraw_money;
	}

	/**
	 * @param pa_redraw_money the pa_redraw_money to set
	 */
	public void setPa_redraw_money(float pa_redraw_money) {
		this.pa_redraw_money = pa_redraw_money;
	}

	/**
	 * @return the pa_redraw_amount
	 */
	public float getPa_redraw_amount() {
		return pa_redraw_amount;
	}

	/**
	 * @param pa_redraw_amount the pa_redraw_amount to set
	 */
	public void setPa_redraw_amount(float pa_redraw_amount) {
		this.pa_redraw_amount = pa_redraw_amount;
	}

	/**
	 * @return the pa_redraw_date
	 */
	public float getPa_redraw_date() {
		return pa_redraw_date;
	}

	/**
	 * @param pa_redraw_date the pa_redraw_date to set
	 */
	public void setPa_redraw_date(float pa_redraw_date) {
		this.pa_redraw_date = pa_redraw_date;
	}

	/**
	 * @return the pa_balance_amount
	 */
	public float getPa_balance_amount() {
		return pa_balance_amount;
	}

	/**
	 * @param pa_balance_amount the pa_balance_amount to set
	 */
	public void setPa_balance_amount(float pa_balance_amount) {
		this.pa_balance_amount = pa_balance_amount;
	}

	/**
	 * @return the pa_balance_date
	 */
	public Date getPa_balance_date() {
		return pa_balance_date;
	}

	/**
	 * @param pa_balance_date the pa_balance_date to set
	 */
	public void setPa_balance_date(Date pa_balance_date) {
		this.pa_balance_date = pa_balance_date;
	}
	
	

}
