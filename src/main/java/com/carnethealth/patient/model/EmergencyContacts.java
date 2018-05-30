package com.carnethealth.patient.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class EmergencyContacts implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	private String carnetId;
	private String em_first_name;
	private String em_last_name;
	private String em_phone_number;
	private String em_patient_relationship;
	private String em_email;
	private String em_social_media_contact ;
	private String em_social_media_type;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "carnetId", referencedColumnName = "carnetId")
	private List<Patient> patient;
	
	public EmergencyContacts() {}
	
	public EmergencyContacts(int id, String carnetId, String em_first_name, String em_last_name,
			String em_phone_number, String em_patient_relationship, String em_email, String em_social_media_contact,
			String em_social_media_type) {
		super();
		this.id = id;
		this.carnetId = carnetId;
		this.em_first_name = em_first_name;
		this.em_last_name = em_last_name;
		this.em_phone_number = em_phone_number;
		this.em_patient_relationship = em_patient_relationship;
		this.em_email = em_email;
		this.em_social_media_contact = em_social_media_contact;
		this.em_social_media_type = em_social_media_type;
	}

	public EmergencyContacts(int id, String carnetId, String em_first_name, String em_last_name,
			String em_phone_number, String em_patient_relationship, String em_email, String em_social_media_contact,
			String em_social_media_type, List<Patient> patient) {
		super();
		this.id = id;
		this.carnetId = carnetId;
		this.em_first_name = em_first_name;
		this.em_last_name = em_last_name;
		this.em_phone_number = em_phone_number;
		this.em_patient_relationship = em_patient_relationship;
		this.em_email = em_email;
		this.em_social_media_contact = em_social_media_contact;
		this.em_social_media_type = em_social_media_type;
		this.patient = patient;
	}

	/**
	 * @return the id
	 */
	@GraphQLQuery(name = "emergencyContactId")
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
	 * @return the em_first_name
	 */
	@GraphQLQuery(name = "emFirstName")
	public String getEm_first_name() {
		return em_first_name;
	}

	/**
	 * @param em_first_name the em_first_name to set
	 */
	public void setEm_first_name(String em_first_name) {
		this.em_first_name = em_first_name;
	}

	/**
	 * @return the em_last_name
	 */
	@GraphQLQuery(name = "emLastName")
	public String getEm_last_name() {
		return em_last_name;
	}

	/**
	 * @param em_last_name the em_last_name to set
	 */
	public void setEm_last_name(String em_last_name) {
		this.em_last_name = em_last_name;
	}

	/**
	 * @return the em_phone_number
	 */
	@GraphQLQuery(name = "emPhoneNumber")
	public String getEm_phone_number() {
		return em_phone_number;
	}

	/**
	 * @param em_phone_number the em_phone_number to set
	 */
	public void setEm_phone_number(String em_phone_number) {
		this.em_phone_number = em_phone_number;
	}

	/**
	 * @return the em_patient_relationship
	 */
	@GraphQLQuery(name = "emPatientRelationship")
	public String getEm_patient_relationship() {
		return em_patient_relationship;
	}

	/**
	 * @param em_patient_relationship the em_patient_relationship to set
	 */
	public void setEm_patient_relationship(String em_patient_relationship) {
		this.em_patient_relationship = em_patient_relationship;
	}

	/**
	 * @return the em_email
	 */
	@GraphQLQuery(name = "emEmail")
	public String getEm_email() {
		return em_email;
	}

	/**
	 * @param em_email the em_email to set
	 */
	public void setEm_email(String em_email) {
		this.em_email = em_email;
	}

	/**
	 * @return the em_social_media_contact
	 */
	@GraphQLQuery(name = "emsocialMediaContact")
	public String getEm_social_media_contact() {
		return em_social_media_contact;
	}

	/**
	 * @param em_social_media_contact the em_social_media_contact to set
	 */
	public void setEm_social_media_contact(String em_social_media_contact) {
		this.em_social_media_contact = em_social_media_contact;
	}

	/**
	 * @return the em_social_media_type
	 */
	@GraphQLQuery(name = "emSocialMediaType")
	public String getEm_social_media_type() {
		return em_social_media_type;
	}

	/**
	 * @param em_social_media_type the em_social_media_type to set
	 */
	public void setEm_social_media_type(String em_social_media_type) {
		this.em_social_media_type = em_social_media_type;
	}

	/**
	 * @return the patient
	 */
	@GraphQLQuery(name = "patients")
	public List<Patient> getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carnetId == null) ? 0 : carnetId.hashCode());
		result = prime * result + ((em_email == null) ? 0 : em_email.hashCode());
		result = prime * result + ((em_first_name == null) ? 0 : em_first_name.hashCode());
		result = prime * result + ((em_last_name == null) ? 0 : em_last_name.hashCode());
		result = prime * result + ((em_patient_relationship == null) ? 0 : em_patient_relationship.hashCode());
		result = prime * result + ((em_phone_number == null) ? 0 : em_phone_number.hashCode());
		result = prime * result + ((em_social_media_contact == null) ? 0 : em_social_media_contact.hashCode());
		result = prime * result + ((em_social_media_type == null) ? 0 : em_social_media_type.hashCode());
		result = prime * result + id;
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
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
		EmergencyContacts other = (EmergencyContacts) obj;
		if (carnetId == null) {
			if (other.carnetId != null)
				return false;
		} else if (!carnetId.equals(other.carnetId))
			return false;
		if (em_email == null) {
			if (other.em_email != null)
				return false;
		} else if (!em_email.equals(other.em_email))
			return false;
		if (em_first_name == null) {
			if (other.em_first_name != null)
				return false;
		} else if (!em_first_name.equals(other.em_first_name))
			return false;
		if (em_last_name == null) {
			if (other.em_last_name != null)
				return false;
		} else if (!em_last_name.equals(other.em_last_name))
			return false;
		if (em_patient_relationship == null) {
			if (other.em_patient_relationship != null)
				return false;
		} else if (!em_patient_relationship.equals(other.em_patient_relationship))
			return false;
		if (em_phone_number == null) {
			if (other.em_phone_number != null)
				return false;
		} else if (!em_phone_number.equals(other.em_phone_number))
			return false;
		if (em_social_media_contact == null) {
			if (other.em_social_media_contact != null)
				return false;
		} else if (!em_social_media_contact.equals(other.em_social_media_contact))
			return false;
		if (em_social_media_type == null) {
			if (other.em_social_media_type != null)
				return false;
		} else if (!em_social_media_type.equals(other.em_social_media_type))
			return false;
		if (id != other.id)
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		return true;
	}
	
	
}
