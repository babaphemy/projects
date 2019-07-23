package net.myeverlasting.essladmin.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class Encoder {
public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
	
	public static final String encodePass(String toencode) {
		String encoded = PASSWORD_ENCODER.encode(toencode);
		return encoded;
	}

}
