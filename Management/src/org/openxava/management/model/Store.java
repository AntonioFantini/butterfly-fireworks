package org.openxava.management.model;

import java.io.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

/**
 * The persistent class for the Store database table.
 * 
 */
@Entity
@NamedQuery(name = "Store.findAll", query = "SELECT s FROM Store s")
@Tab(rowStyles=@RowStyle(style="row-highlight", property = "uploadDate", value = "steady"),
	properties="downloadDate, uploadDate, bomb.type, bomb.weight, bomb.category.categoryDescription ")
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Hidden
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idStore;

	@ReadOnly
	@Temporal(TemporalType.TIMESTAMP)
	private Date downloadDate;

	@Temporal(TemporalType.TIMESTAMP)
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date uploadDate;

	// bi-directional many-to-one association to Bomb
	@ManyToOne
	@JoinColumn(name = "bombId")
	private Bomb bomb;


	public Store() {
	}

	public int getIdStore() {
		return this.idStore;
	}

	public void setIdStore(int idStore) {
		this.idStore = idStore;
	}

	public Date getDownloadDate() {
		return this.downloadDate;
	}

	public void setDownloadDate(Date downloadDate) {
		this.downloadDate = downloadDate;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public Bomb getBomb() {
		return this.bomb;
	}

	public void setBomb(Bomb bomb1) {
		this.bomb = bomb1;
	}
}