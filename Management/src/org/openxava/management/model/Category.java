package org.openxava.management.model;

import java.io.*;

import javax.persistence.*;

import org.openxava.annotations.*;

/**
 * The persistent class for the Category database table.
 * 
 */
@Entity
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Hidden
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String categoryId;

	private String categoryDescription;

	public Category() {
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

}