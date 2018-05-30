package com.carnethealth.patient.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class LoginCredentials implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String carnetId;
	private String username;
	private String password;
	
	public LoginCredentials() {}
	
	public LoginCredentials(String carnetId, String username, String password) {
		super();
		this.carnetId = carnetId;
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the id
	 */
	@GraphQLQuery(name = "loginCredentials")
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
	 * @return the username
	 */
	@GraphQLQuery(name = "username")
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	@GraphQLQuery(name = "password")
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		LoginCredentials other = (LoginCredentials) obj;
		if (carnetId == null) {
			if (other.carnetId != null)
				return false;
		} else if (!carnetId.equals(other.carnetId))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}	
	
}
