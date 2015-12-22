package org.openxava.management.model;

import java.io.Serializable;

import javax.persistence.*;

import org.openxava.annotations.*;

import java.util.List;

/**
 * The persistent class for the Supplier database table.
 * 
 */
@Entity
@NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Hidden
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String supplierId;

	private String address;

	private String name;

	public Supplier() {
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}