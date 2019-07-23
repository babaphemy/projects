package net.myeverlasting.essladmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Project;

@Service
public interface ProjectRepo extends JpaRepository<Project, Long> {
	List<Project> findByOwnerId(Long id);
	List<Project> findByAdminId(Long id);

}
