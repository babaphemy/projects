package net.myeverlasting.essladmin.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ph_tranx")
public class Tranx extends BaseEntity {
	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JsonIgnore
	private Appuser payee;
	@Transient
	private Long usr;
	private String tranxtype;
	private String tranxDescription;
	private String txnref;
	private double amount;
	private String cardNumber;
	private String responseCode;
	private String responseDescription;
	private String paymentRef;
	private String status;
	@Temporal(TemporalType.DATE)
	private Date tranxdate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date duedate;
	//@ManyToMany(fetch=FetchType.LAZY)
	//@JsonManagedReference
	//@JsonIgnore
	//private List<Product> feestopay = new ArrayList<Fee>(); //unidirectional
	//@ManyToMany(fetch=FetchType.LAZY)
	//@JsonManagedReference
	//@JsonIgnore
	//private List<Subject> registered = new ArrayList<Subject>(); //unidirectional
	public Appuser getPayee() {
		return payee;
	}
	public void setPayee(Appuser payee) {
		this.payee = payee;
	}
	public String getTranxtype() {
		return tranxtype;
	}
	public void setTranxtype(String tranxtype) {
		this.tranxtype = tranxtype;
	}
	public String getTranxDescription() {
		return tranxDescription;
	}
	public void setTranxDescription(String tranxDescription) {
		this.tranxDescription = tranxDescription;
	}
	public String getTxnref() {
		return txnref;
	}
	public void setTxnref(String txnref) {
		this.txnref = txnref;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getPaymentRef() {
		return paymentRef;
	}
	public void setPaymentRef(String paymentRef) {
		this.paymentRef = paymentRef;
	}
	public Date getTranxdate() {
		return tranxdate;
	}
	public void setTranxdate(Date tranxdate) {
		this.tranxdate = tranxdate;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getUsr() {
		return usr;
	}
	public void setUsr(Long usr) {
		this.usr = usr;
	}
	
	

	/* bb start here
	private String paymentLogId;
	private String isreversal;
	private String institutionname;
	private String branchname;
	private String bankname;
	private String receiptno;
	private String collectionsacct;
	private String thirdpartycode;
	private String customername;
	private String depositslipno;*/
	
	

}
