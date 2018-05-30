package com.carnethealth.patient.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class PasswordRecovery implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String carnetId;
	private String secret_pin;
	private String questions_1;
	private String questions_2;
	private String questions_3;
	private String questions_4;
	private String questions_5;
	
	PasswordRecovery(){}

	public PasswordRecovery(String carnetId, String secret_pin, String questions_1, String questions_2,
			String questions_3, String questions_4, String questions_5) {
		super();
		this.carnetId = carnetId;
		this.secret_pin = secret_pin;
		this.questions_1 = questions_1;
		this.questions_2 = questions_2;
		this.questions_3 = questions_3;
		this.questions_4 = questions_4;
		this.questions_5 = questions_5;
	}
	
	

	/**
	 * @return the id
	 */
	@GraphQLQuery(name = "passwordRecoveryId")
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the carnetId
	 */
	@GraphQLQuery(name = "carnetId")
	public String getCarnetId() {
		return carnetId;
	}

	/**
	 * @param carnetId the carnetId to set
	 */
	public void setCarnetId(String carnetId) {
		this.carnetId = carnetId;
	}

	/**
	 * @return the secret_pin
	 */
	@GraphQLQuery(name = "secretPin")
	public String getSecret_pin() {
		return secret_pin;
	}

	/**
	 * @param secret_pin the secret_pin to set
	 */
	public void setSecret_pin(String secret_pin) {
		this.secret_pin = secret_pin;
	}

	/**
	 * @return the questions_1
	 */
	@GraphQLQuery(name = "question1")
	public String getQuestions_1() {
		return questions_1;
	}

	/**
	 * @param questions_1 the questions_1 to set
	 */
	public void setQuestions_1(String questions_1) {
		this.questions_1 = questions_1;
	}

	/**
	 * @return the questions_2
	 */
	@GraphQLQuery(name = "question2")
	public String getQuestions_2() {
		return questions_2;
	}

	/**
	 * @param questions_2 the questions_2 to set
	 */
	public void setQuestions_2(String questions_2) {
		this.questions_2 = questions_2;
	}

	/**
	 * @return the questions_3
	 */
	@GraphQLQuery(name = "question3")
	public String getQuestions_3() {
		return questions_3;
	}

	/**
	 * @param questions_3 the questions_3 to set
	 */
	public void setQuestions_3(String questions_3) {
		this.questions_3 = questions_3;
	}

	/**
	 * @return the questions_4
	 */
	@GraphQLQuery(name = "question4")
	public String getQuestions_4() {
		return questions_4;
	}

	/**
	 * @param questions_4 the questions_4 to set
	 */
	public void setQuestions_4(String questions_4) {
		this.questions_4 = questions_4;
	}

	/**
	 * @return the questions_5
	 */
	@GraphQLQuery(name = "question5")
	public String getQuestions_5() {
		return questions_5;
	}

	/**
	 * @param questions_5 the questions_5 to set
	 */
	public void setQuestions_5(String questions_5) {
		this.questions_5 = questions_5;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carnetId == null) ? 0 : carnetId.hashCode());
		result = prime * result + id;
		result = prime * result + ((questions_1 == null) ? 0 : questions_1.hashCode());
		result = prime * result + ((questions_2 == null) ? 0 : questions_2.hashCode());
		result = prime * result + ((questions_3 == null) ? 0 : questions_3.hashCode());
		result = prime * result + ((questions_4 == null) ? 0 : questions_4.hashCode());
		result = prime * result + ((questions_5 == null) ? 0 : questions_5.hashCode());
		result = prime * result + ((secret_pin == null) ? 0 : secret_pin.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PasswordRecovery other = (PasswordRecovery) obj;
		if (carnetId == null) {
			if (other.carnetId != null)
				return false;
		} else if (!carnetId.equals(other.carnetId))
			return false;
		if (id != other.id)
			return false;
		if (questions_1 == null) {
			if (other.questions_1 != null)
				return false;
		} else if (!questions_1.equals(other.questions_1))
			return false;
		if (questions_2 == null) {
			if (other.questions_2 != null)
				return false;
		} else if (!questions_2.equals(other.questions_2))
			return false;
		if (questions_3 == null) {
			if (other.questions_3 != null)
				return false;
		} else if (!questions_3.equals(other.questions_3))
			return false;
		if (questions_4 == null) {
			if (other.questions_4 != null)
				return false;
		} else if (!questions_4.equals(other.questions_4))
			return false;
		if (questions_5 == null) {
			if (other.questions_5 != null)
				return false;
		} else if (!questions_5.equals(other.questions_5))
			return false;
		if (secret_pin == null) {
			if (other.secret_pin != null)
				return false;
		} else if (!secret_pin.equals(other.secret_pin))
			return false;
		return true;
	}
		
}
