package com.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TEST database table.
 * 
 */
@Entity
@Table(name="TEST")
@NamedQuery(name="Test.findAll", query="SELECT t FROM Test t")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, precision=22)
	private long imageid;

	@Column(nullable=false, precision=22)
	private BigDecimal imagelength;

	@Column(nullable=false, length=256)
	private String imagename;

	@Lob
	@Column(nullable=false)
	private byte[] imagetest;

	public Test() {
	}

	public long getImageid() {
		return this.imageid;
	}

	public void setImageid(long imageid) {
		this.imageid = imageid;
	}

	public BigDecimal getImagelength() {
		return this.imagelength;
	}

	public void setImagelength(BigDecimal imagelength) {
		this.imagelength = imagelength;
	}

	public String getImagename() {
		return this.imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public byte[] getImagetest() {
		return this.imagetest;
	}

	public void setImagetest(byte[] imagetest) {
		this.imagetest = imagetest;
	}

}