package net.myeverlasting.essladmin.api;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.myeverlasting.essladmin.entity.Appuser;
import net.myeverlasting.essladmin.service.UserServ;

@CrossOrigin
@RestController
@RequestMapping("/api/*")
public class Basecon {
	private UserServ userServ;
	@RequestMapping(value = "users/add", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<Object> newUser(@RequestBody Appuser user) {
		user.setCreatedOn(new Date());
		user.setUpdatedOn(new Date());
		user = userServ.saveUser(user);
		return new ResponseEntity<Object>(user,HttpStatus.OK);
	}
	@RequestMapping(value = "users/all", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> allusers(){
		List<Appuser> all = userServ.allUsers();
		return new ResponseEntity<Object>(all,HttpStatus.OK);
	}
	
	
	

}
