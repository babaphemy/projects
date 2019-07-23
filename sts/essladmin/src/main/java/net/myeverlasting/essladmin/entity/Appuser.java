package net.myeverlasting.essladmin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "es_users")
public class Appuser extends BaseEntity{
	private String firstname;
	private String lastname;
	@Column(unique=true)
	private String email;
	private String password;
	@Column(unique=true)
	private String username;	
	private String phone;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String gender;
	private String address;
	private String country;
	private String confirmationToken;
	private boolean active;
	@Enumerated(EnumType.STRING)
	private MemberType memberType;
	private String companyname;
	private String rcnumber;
	private String caccert;
	private String license;
	private boolean isCooperate;
	
	private String photo;
	private String twitter;
	private String fb;
	private String info;
	private String state;
	private String city;
	private String lga;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastlogin;
	@Enumerated(EnumType.STRING)
	private Usertype usertype;
	@ManyToOne
	@JsonIgnore
	private Group grpp;
	@JsonIgnore
    private String[] roles;
	private boolean admin;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getConfirmationToken() {
		return confirmationToken;
	}
	public void setConfirmationToken(String confirmationToken) {
		this.confirmationToken = confirmationToken;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public MemberType getMemberType() {
		return memberType;
	}
	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getRcnumber() {
		return rcnumber;
	}
	public void setRcnumber(String rcnumber) {
		this.rcnumber = rcnumber;
	}
	public String getCaccert() {
		return caccert;
	}
	public void setCaccert(String caccert) {
		this.caccert = caccert;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public boolean isCooperate() {
		return isCooperate;
	}
	public void setCooperate(boolean isCooperate) {
		this.isCooperate = isCooperate;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLga() {
		return lga;
	}
	public void setLga(String lga) {
		this.lga = lga;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public Usertype getUsertype() {
		return usertype;
	}
	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}
	public Group getGrpp() {
		return grpp;
	}
	public void setGrpp(Group grpp) {
		this.grpp = grpp;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	

}
