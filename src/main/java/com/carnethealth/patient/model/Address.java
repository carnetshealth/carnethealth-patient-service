package com.carnethealth.patient.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class Address implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	private String street;
	private String neighborhood;
	private String city;
	private String region_state;
	private String country;
	private String zipCode_postCode;
	private String carnetId;
	
	public Address() {}
	
	public Address(String street, String neighborhood, String city, String region_state, String country,
			String zipCode_postCode) {
		super();
		this.street = street;
		this.neighborhood = neighborhood;
		this.city = city;
		this.region_state = region_state;
		this.country = country;
		this.zipCode_postCode = zipCode_postCode;
	}


	/**
	 * @return the id
	 */
	@GraphQLQuery(name = "addressId")
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
	 * @return the street
	 */
	@GraphQLQuery(name = "street")
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the neighborhood
	 */
	@GraphQLQuery(name = "neighborhood")
	public String getNeighborhood() {
		return neighborhood;
	}

	/**
	 * @param neighborhood the neighborhood to set
	 */
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	/**
	 * @return the city
	 */
	@GraphQLQuery(name = "city")
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the region_state
	 */
	@GraphQLQuery(name = "regionState")
	public String getRegion_state() {
		return region_state;
	}

	/**
	 * @param region_state the region_state to set
	 */
	public void setRegion_state(String region_state) {
		this.region_state = region_state;
	}

	/**
	 * @return the country
	 */
	@GraphQLQuery(name = "country")
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the zipCode_postCode
	 */
	@GraphQLQuery(name = "zipCodePostCode")
	public String getZipCode_postCode() {
		return zipCode_postCode;
	}

	/**
	 * @param zipCode_postCode the zipCode_postCode to set
	 */
	public void setZipCode_postCode(String zipCode_postCode) {
		this.zipCode_postCode = zipCode_postCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carnetId == null) ? 0 : carnetId.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + ((neighborhood == null) ? 0 : neighborhood.hashCode());
		result = prime * result + ((region_state == null) ? 0 : region_state.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zipCode_postCode == null) ? 0 : zipCode_postCode.hashCode());
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
		Address other = (Address) obj;
		if (carnetId == null) {
			if (other.carnetId != null)
				return false;
		} else if (!carnetId.equals(other.carnetId))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (neighborhood == null) {
			if (other.neighborhood != null)
				return false;
		} else if (!neighborhood.equals(other.neighborhood))
			return false;
		if (region_state == null) {
			if (other.region_state != null)
				return false;
		} else if (!region_state.equals(other.region_state))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (zipCode_postCode == null) {
			if (other.zipCode_postCode != null)
				return false;
		} else if (!zipCode_postCode.equals(other.zipCode_postCode))
			return false;
		return true;
	}
	
	
	
}
