package net.myeverlasting.essladmin.api;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

public class ErrorCon implements ErrorController {
	private static final String PATH = "/error";
	
	public ErrorCon() {};
	
	private Gson gson = new Gson();
	@RequestMapping("/error")
	public ResponseEntity<Object> error() {
		return new ResponseEntity<Object>(gson.toJson("The server rejected your request because its badly formatted!"), org.springframework.http.HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
	}

	@Override
	public String getErrorPath() {
		
		return PATH;
	}

}
