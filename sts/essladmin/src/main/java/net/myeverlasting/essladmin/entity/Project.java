package net.myeverlasting.essladmin.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name ="ph_projects")
public class Project extends BaseEntity {
	private String title,reference;
	@ManyToOne
	private Merchant owner;
	@OneToOne
	private Appuser admin;
	private int percentOwnershipEssl;
	private BigDecimal cost;
	private String currency;
	@Temporal(TemporalType.DATE)
	private Date expectedDelivery,actualDelivery;
	private String status;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Merchant getOwner() {
		return owner;
	}
	public void setOwner(Merchant owner) {
		this.owner = owner;
	}
	public Appuser getAdmin() {
		return admin;
	}
	public void setAdmin(Appuser admin) {
		this.admin = admin;
	}
	public int getPercentOwnershipEssl() {
		return percentOwnershipEssl;
	}
	public void setPercentOwnershipEssl(int percentOwnershipEssl) {
		this.percentOwnershipEssl = percentOwnershipEssl;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getExpectedDelivery() {
		return expectedDelivery;
	}
	public void setExpectedDelivery(Date expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}
	public Date getActualDelivery() {
		return actualDelivery;
	}
	public void setActualDelivery(Date actualDelivery) {
		this.actualDelivery = actualDelivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
