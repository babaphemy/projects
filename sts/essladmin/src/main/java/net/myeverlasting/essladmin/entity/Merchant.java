package net.myeverlasting.essladmin.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name ="ph_merchants")
public class Merchant extends BaseEntity {
	private String bizname,bizmail,bizphone,website;
	private boolean active;
	private BigDecimal acctbalance;
	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Project> projects;
	@OneToOne
	private Appuser owner;
	@Temporal(TemporalType.DATE)
	private Date joined;
	public String getBizname() {
		return bizname;
	}
	public void setBizname(String bizname) {
		this.bizname = bizname;
	}
	public String getBizmail() {
		return bizmail;
	}
	public void setBizmail(String bizmail) {
		this.bizmail = bizmail;
	}
	public String getBizphone() {
		return bizphone;
	}
	public void setBizphone(String bizphone) {
		this.bizphone = bizphone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public BigDecimal getAcctbalance() {
		return acctbalance;
	}
	public void setAcctbalance(BigDecimal acctbalance) {
		this.acctbalance = acctbalance;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Appuser getOwner() {
		return owner;
	}
	public void setOwner(Appuser owner) {
		this.owner = owner;
	}
	

}
