package net.myeverlasting.essladmin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Project;
import net.myeverlasting.essladmin.repository.ProjectRepo;

@Service
public class ProjectServImpl implements ProjectServ {
	private ProjectRepo projectRepo;
	

	public ProjectServImpl(ProjectRepo projectRepo) {
		super();
		this.projectRepo = projectRepo;
	}

	@Override
	public List<Project> findAll() {
	
		return projectRepo.findAll();
	}

	@Override
	public Project findOne(Long id) {
	
		return projectRepo.getOne(id);
	}

	@Override
	public Project addOne(Project project) {
	
		return projectRepo.save(project);
	}

	@Override
	public List<Project> byAdmin(Long id) {
	
		return projectRepo.findByAdminId(id);
	}

	@Override
	public List<Project> byOwner(Long id) {
	
		return projectRepo.findByOwnerId(id);
	}

}
