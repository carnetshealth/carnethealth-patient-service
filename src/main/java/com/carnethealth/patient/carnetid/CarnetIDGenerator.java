package com.carnethealth.patient.carnetid;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
@Table(name = "carnet_id_generator")
public class CarnetIDGenerator {
	
	@Id
    @Column(name = "code_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY,generator="carnetid_generator")
	@SequenceGenerator(name="carnetid_generator",initialValue=10010,allocationSize=1,sequenceName="carnetid_generator")
	private long id;
	
	@Column(name = "cn_holder_type")
	private String cn_holder_type;
	
	private Date creation_date;
	
	private String country;
	 
	public CarnetIDGenerator() {}
	
	public CarnetIDGenerator(int id, String cn_holder_type, Date creation_date, String country) {
		super();
		this.id = id;
		this.cn_holder_type = cn_holder_type;
		this.creation_date = creation_date;
		this.country = country;
	}
	
	/**
	 * @return the id
	 */
	//@GraphQLQuery(name = "codeId")
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the cn_holder_type
	 */
	//@GraphQLQuery(name = "cnHolderType")
	public String getCn_holder_type() {
		return cn_holder_type;
	}
	/**
	 * @param cn_holder_type the cn_holder_type to set
	 */
	public void setCn_holder_type(String cn_holder_type) {
		this.cn_holder_type = cn_holder_type;
	}
	/**
	 * @return the creation_date
	 */
	//@GraphQLQuery(name = "creationDate")
	public Date getCreation_date() {
		return creation_date;
	}
	/**
	 * @param creation_date the creation_date to set
	 */
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	/**
	 * @return the country
	 */
	//@GraphQLQuery(name = "country")
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
}
