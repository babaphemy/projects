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

import net.myeverlasting.essladmin.entity.Merchant;
import net.myeverlasting.essladmin.service.MerchServ;
@CrossOrigin
@RestController
@RequestMapping("/merch/*")
public class MerchCon {
	private MerchServ merchServ;
	
	@RequestMapping(value = "all", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> allMerchs(){
		List<Merchant> allm = merchServ.all();
		return new ResponseEntity<Object>(allm,HttpStatus.OK);
	}
	@RequestMapping(value = "byowner", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> byOwner(HttpServletRequest req) {
		Long oid = Long.parseLong(req.getParameter("usr"));
		List<Merchant> byowner = merchServ.byOwner(oid);
		return new ResponseEntity<Object>(byowner, HttpStatus.OK);
	}
	@RequestMapping(value = "getone", method=RequestMethod.GET, produces="application/json")
	public ResponseEntity<Object> oneMerch(HttpServletRequest req) {
		Long mid = Long.parseLong(req.getParameter("mid"));
		Merchant mer = merchServ.findOne(mid);
		return new ResponseEntity<Object>(mer,HttpStatus.OK);
	}
	@RequestMapping(value="addmerch", method=RequestMethod.POST, produces="application/json")
	public ResponseEntity<Object> addMerchant(@RequestBody Merchant merch){
		merch.setCreatedOn(new Date());
		merch.setUpdatedOn(new Date());
		merch = merchServ.addOne(merch);
		return new ResponseEntity<Object>(merch,HttpStatus.OK);
	}

}
