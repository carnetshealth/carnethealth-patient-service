package com.carnethealth.patient.carnetid;

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
@Table(name = "cn_holders_type")
public class CnHoldersType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  id;
	
	@Column(name = "cn_holder_type")
	private String cn_holder_type ;
	
	private String cn_holde_definition;
	
	 @OneToMany(cascade = CascadeType.ALL)
     @JoinColumn(name = "cn_holder_type", referencedColumnName = "cn_holder_type")
	 private List<CarnetIDGenerator> carnetIDGenerator;
	
	public CnHoldersType() {}
	
	public CnHoldersType(String cn_holder_type, String cn_holde_definition) {
		super();
		this.cn_holder_type = cn_holder_type;
		this.cn_holde_definition = cn_holde_definition;
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
	 * @return the cn_holde_definition
	 */
	//@GraphQLQuery(name = "cnHolderdefinition")
	public String getCn_holde_definition() {
		return cn_holde_definition;
	}
	/**
	 * @param cn_holde_definition the cn_holde_definition to set
	 */
	public void setCn_holde_definition(String cn_holde_definition) {
		this.cn_holde_definition = cn_holde_definition;
	}

	/**
	 * @return the carnetIDGenerator
	 */
	//@GraphQLQuery(name = "carnetIDGenerators")
	public List<CarnetIDGenerator> getCarnetIDGenerator() {
		return carnetIDGenerator;
	}

	/**
	 * @param carnetIDGenerator the carnetIDGenerator to set
	 */
	public void setCarnetIDGenerator(List<CarnetIDGenerator> carnetIDGenerator) {
		this.carnetIDGenerator = carnetIDGenerator;
	}

}
