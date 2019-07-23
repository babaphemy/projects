package net.myeverlasting.essladmin.service;

import java.util.List;

import net.myeverlasting.essladmin.entity.Project;

public interface ProjectServ {
	public abstract List<Project> findAll();
	public abstract Project findOne(Long id);
	public abstract Project addOne(Project project);
	public abstract List<Project> byAdmin(Long id);
	public abstract List<Project> byOwner(Long id);

}
