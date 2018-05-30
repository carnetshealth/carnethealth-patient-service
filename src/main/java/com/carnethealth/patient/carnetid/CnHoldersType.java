package com.carnethealth.patient.carnetid;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.leangen.graphql.annotations.GraphQLQuery;

@Entity
public class CnHoldersType implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	
	@Column(name = "cn_holder_type")
	private String cn_holder_type ;
	
	private String cnHoldeDefinition;
	
	 @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "cn_holder_type", referencedColumnName = "cn_holder_type")
	 private List<CarnetIDGenerator> carnetIDGenerator;
	
	public CnHoldersType() {}
	
	public CnHoldersType(String cn_holder_type, String cnHoldeDefinition) {
		super();
		this.cn_holder_type = cn_holder_type;
		this.cnHoldeDefinition = cnHoldeDefinition;
	}
	
	/**
	 * @return the id
	 */
	//@GraphQLQuery(name = "cnHolderTypeId")
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
	 * @return the cnHoldeDefinition
	 */
	//@GraphQLQuery(name = "cnHolderdefinition")
	public String getCnHoldeDefinition() {
		return cnHoldeDefinition;
	}
	/**
	 * @param cnHoldeDefinition the cnHoldeDefinition to set
	 */
	public void setCnHoldeDefinition(String cnHoldeDefinition) {
		this.cnHoldeDefinition = cnHoldeDefinition;
	}

	/**
	 * @return the carnetIDGenerator
	 */
	/*//@GraphQLQuery(name = "carnetIDGenerators")
	public List<CarnetIDGenerator> getCarnetIDGenerator() {
		return carnetIDGenerator;
	}

	*//**
	 * @param carnetIDGenerator the carnetIDGenerator to set
	 *//*
	public void setCarnetIDGenerator(List<CarnetIDGenerator> carnetIDGenerator) {
		this.carnetIDGenerator = carnetIDGenerator;
	}
*/
}
