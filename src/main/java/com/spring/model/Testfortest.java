package com.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TESTFORTEST database table.
 * 
 */
@Entity
@Table(name="TESTFORTEST")
@NamedQuery(name="Testfortest.findAll", query="SELECT t FROM Testfortest t")
public class Testfortest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, precision=22)
	private long persionid;

	@Column(length=50)
	private String lastname;

	@Column(length=50)
	private String name;

	public Testfortest() {
	}

	public long getPersionid() {
		return this.persionid;
	}

	public void setPersionid(long persionid) {
		this.persionid = persionid;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}