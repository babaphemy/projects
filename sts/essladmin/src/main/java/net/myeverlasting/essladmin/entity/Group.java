package net.myeverlasting.essladmin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="es_group")
public class Group extends BaseEntity {
	private String title;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="grpp")
	@JsonIgnore
	private List<Appuser> members;
	@ManyToMany(fetch=FetchType.LAZY)
	@JsonIgnore
	private List<Menu> menus;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Appuser> getMembers() {
		return members;
	}
	public void setMembers(List<Appuser> members) {
		this.members = members;
	}
	public List<Menu> getMenus() {
		return menus;
	}
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	


	
	
	
	

}
