package org.openxava.management.actions.objects;

import java.math.*;
import java.util.*;

public class DownloadSelection {

	private Date downloadDate;
	private Date uploadDate;
	private String type;
	private BigInteger weight;
	private String categoryDescription;
	
	public DownloadSelection(Map data) {
		this.downloadDate = (Date) data.get("downloadDate");
		this.uploadDate = (Date) data.get("uploadDate");
		Map bomb = (Map) data.get("bomb");
		this.type = (String) bomb.get("type");
		this.weight = (BigInteger) bomb.get("weight");
		Map category = (Map) bomb.get("category");
		this.categoryDescription = (String) category.get("categoryDescription");
	}
	
	public DownloadSelection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDownloadDate() {
		return downloadDate;
	}
	public void setDownloadDate(Date downloadDate) {
		this.downloadDate = downloadDate;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigInteger getWeight() {
		return weight;
	}
	public void setWeight(BigInteger weight) {
		this.weight = weight;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String category) {
		this.categoryDescription = category;
	}
	
	
	

}
