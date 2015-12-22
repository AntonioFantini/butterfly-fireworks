package org.openxava.management.model;

import java.io.*;
import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

/**
 * The persistent class for the Bomb database table.
 * 
 */
@Entity
@NamedQuery(name = "Bomb.findAll", query = "SELECT b FROM Bomb b")
public class Bomb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Hidden
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String bombId;

	private String type;

	private BigInteger weight;

	// bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	// bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name = "supplierId")
	private Supplier supplier;

	public Bomb() {
	}

	public String getBombId() {
		return this.bombId;
	}

	public void setBombId(String bombId) {
		this.bombId = bombId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigInteger getWeight() {
		return this.weight;
	}

	public void setWeight(BigInteger weight) {
		this.weight = weight;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}