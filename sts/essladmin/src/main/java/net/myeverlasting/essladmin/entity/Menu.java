package net.myeverlasting.essladmin.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="es_menus")
public class Menu extends BaseEntity {
	private String title,icon,state;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


	
	

}
