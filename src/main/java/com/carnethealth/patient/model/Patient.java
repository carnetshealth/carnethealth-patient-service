package com.carnethealth.patient.model;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import io.leangen.graphql.annotations.GraphQLQuery;



@Entity
public class Patient implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String carnetId;
	private String firstName;
	private String lastName;
	private String email;
	
	@CreationTimestamp
	private Date birthdate;
	
	private String national_id_number;
	private String guardian_nin;
	private String phone_number;
	
	@CreationTimestamp
	private Date registration_date;
	
	private String patient_status;
	//private PasswordRecovery passwordRecovery;
	//private LoginCredentials loginCredentials;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "carnetId", referencedColumnName = "carnetId")
	private List<Address> address;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "carnetId", referencedColumnName = "carnetId")
	private List<EmergencyContacts> emergencyContacts;

	@Override
	public String toString() {
		return String.format(
				"Patient [id=%s, carnetId=%s, firstName=%s, lastName=%s, email=%s, birthdate=%s, "
				+ "national_id_number=%s, guardian_nin=%s,"
				+ "phone_number=%s, registration_date=%s, patient_status=%s]", id,
				carnetId, firstName, lastName,email,birthdate,national_id_number,guardian_nin,phone_number,registration_date,patient_status);
	}
	public Patient() {}
	
	public Patient(String carnetId, String firstName, String lastName, String email, 
			String national_id_number, String guardian_nin, String phone_number,
			String patient_status) {
		super();
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.patient_status = patient_status;
	}
	
	public Patient(String carnetId, String firstName, String lastName, String email, Date birthdate,
			String national_id_number, String guardian_nin, String phone_number, Date registration_date,
			String patient_status) {
		super();
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.registration_date = registration_date;
		this.patient_status = patient_status;
	}

	public Patient(String carnetId, String firstName, String lastName, String email, Date birthdate,
			String national_id_number, String guardian_nin, String phone_number, Date registration_date,
			String patient_status, List<Address> address) {
		super();
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.registration_date = registration_date;
		this.patient_status = patient_status;
		this.address = address;
	}

	public Patient(String carnetId, String firstName, String lastName, String email, Date birthdate,
			String national_id_number, String guardian_nin, String phone_number, Date registration_date,
			String patient_status, List<Address> address, List<EmergencyContacts> emergencyContacts) {
		super();
		this.id = id;
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.registration_date = registration_date;
		this.patient_status = patient_status;
		this.address = address;
        //this.emergencyContacts = emergencyContacts;
	}
	
	public Patient(String carnetId, String firstName, String lastName, String email, Date birthdate,
			String national_id_number, String guardian_nin, String phone_number, Date registration_date,
			String patient_status, List<Address> address, List<EmergencyContacts> emergencyContacts,
			PasswordRecovery passwordRecovery) {
		super();
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.registration_date = registration_date;
		this.patient_status = patient_status;
		this.address = address;
		//this.emergencyContacts = emergencyContacts;
		//this.passwordRecovery = passwordRecovery;
	}
	
	public Patient(Long id, String carnetId, String firstName, String lastName, String email, Date birthdate,
			String national_id_number, String guardian_nin, String phone_number, Date registration_date,
			String patient_status, List<Address> address, List<EmergencyContacts> emergencyContacts,
			PasswordRecovery passwordRecovery, LoginCredentials loginCredentials) {
		super();
		this.id = id;
		this.carnetId = carnetId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.birthdate = birthdate;
		this.national_id_number = national_id_number;
		this.guardian_nin = guardian_nin;
		this.phone_number = phone_number;
		this.registration_date = registration_date;
		this.patient_status = patient_status;
		this.address = address;
		//this.emergencyContacts = emergencyContacts;
		//this.passwordRecovery = passwordRecovery;
		//this.loginCredentials = loginCredentials;
	}

	/**
	 * @return the id
	 */
	@GraphQLQuery(name = "patientId")
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
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
	 * @return the firstName
	 */
	@GraphQLQuery(name = "firstName")
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	@GraphQLQuery(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	@GraphQLQuery(name = "email")
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the birthdate
	 */
	@GraphQLQuery(name = "birthDate")
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * @return the national_id_number
	 */
	@GraphQLQuery(name = "nationalIdNumber")
	public String getNational_id_number() {
		return national_id_number;
	}

	/**
	 * @param national_id_number the national_id_number to set
	 */
	public void setNational_id_number(String national_id_number) {
		this.national_id_number = national_id_number;
	}

	/**
	 * @return the guardian_nin
	 */
	@GraphQLQuery(name = "guardianNin")
	public String getGuardian_nin() {
		return guardian_nin;
	}

	/**
	 * @param guardian_nin the guardian_nin to set
	 */
	public void setGuardian_nin(String guardian_nin) {
		this.guardian_nin = guardian_nin;
	}

	/**
	 * @return the phone_number
	 */
	@GraphQLQuery(name = "phoneNumber")
	public String getPhone_number() {
		return phone_number;
	}

	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/**
	 * @return the registration_date
	 */
	@GraphQLQuery(name = "registrationDate")
	public Date getRegistration_date() {
		return registration_date;
	}

	/**
	 * @param registration_date the registration_date to set
	 */
	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}

	/**
	 * @return the patient_status
	 */
	@GraphQLQuery(name = "patientStatus")
	public String getPatient_status() {
		return patient_status;
	}

	/**
	 * @param patient_status the patient_status to set
	 */
	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}

	/**
	 * @return the address
	 */
	@GraphQLQuery(name = "address")
	public List<Address> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((carnetId == null) ? 0 : carnetId.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((emergencyContacts == null) ? 0 : emergencyContacts.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((guardian_nin == null) ? 0 : guardian_nin.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((national_id_number == null) ? 0 : national_id_number.hashCode());
		result = prime * result + ((patient_status == null) ? 0 : patient_status.hashCode());
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((registration_date == null) ? 0 : registration_date.hashCode());
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
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (carnetId == null) {
			if (other.carnetId != null)
				return false;
		} else if (!carnetId.equals(other.carnetId))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (emergencyContacts == null) {
			if (other.emergencyContacts != null)
				return false;
		} else if (!emergencyContacts.equals(other.emergencyContacts))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (guardian_nin == null) {
			if (other.guardian_nin != null)
				return false;
		} else if (!guardian_nin.equals(other.guardian_nin))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (national_id_number == null) {
			if (other.national_id_number != null)
				return false;
		} else if (!national_id_number.equals(other.national_id_number))
			return false;
		if (patient_status == null) {
			if (other.patient_status != null)
				return false;
		} else if (!patient_status.equals(other.patient_status))
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (registration_date == null) {
			if (other.registration_date != null)
				return false;
		} else if (!registration_date.equals(other.registration_date))
			return false;
		return true;
	}

	

	/*@GraphQLQuery(name = "emergencyContacts")
	public List<EmergencyContacts> getEmergencyContacts() {
		return emergencyContacts;
	}


	public void setEmergencyContacts(List<EmergencyContacts> emergencyContacts) {
		this.emergencyContacts = emergencyContacts;
	}


	@GraphQLQuery(name = "passwordRecovery")
	public PasswordRecovery getPasswordRecovery() {
		return passwordRecovery;
	}


	public void setPasswordRecovery(PasswordRecovery passwordRecovery) {
		this.passwordRecovery = passwordRecovery;
	}


	@GraphQLQuery(name = "loginCredentials")
	public LoginCredentials getLoginCredentials() {
		return loginCredentials;
	}

	public void setLoginCredentials(LoginCredentials loginCredentials) {
		this.loginCredentials = loginCredentials;
	}*/
	
	
}
