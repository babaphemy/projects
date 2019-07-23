package net.myeverlasting.essladmin.api;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.myeverlasting.essladmin.entity.Project;
import net.myeverlasting.essladmin.service.ProjectServ;

@CrossOrigin
@RestController
@RequestMapping("/project/*")
public class ProjectCon {
	private ProjectServ projectServ;

	public ProjectCon(ProjectServ projectServ) {
		super();
		this.projectServ = projectServ;
	}
	@RequestMapping(value = "all", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> getAll(){
		List<Project> allp = projectServ.findAll();
		return new ResponseEntity<Object>(allp, HttpStatus.OK);
	}
	@RequestMapping(value = "byadmin", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> byAdmin(HttpServletRequest req){
		Long aid = Long.parseLong(req.getParameter("aid"));
		List<Project> byadmin = projectServ.byAdmin(aid);
		return new ResponseEntity<Object>(byadmin, HttpStatus.OK);
	}
	@RequestMapping(value = "byowner", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> byOwner(HttpServletRequest req){
		Long oid = Long.parseLong(req.getParameter("oid"));
		List<Project> byowner = projectServ.byOwner(oid);
		return new ResponseEntity<Object>(byowner, HttpStatus.OK);
	}
	@RequestMapping(value = "add", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<Object> addNew(@RequestBody Project project){
		project.setCreatedOn(new Date());
		project.setUpdatedOn(new Date());
		project = projectServ.addOne(project);
		return new ResponseEntity<Object>(project, HttpStatus.OK);
	}

}
