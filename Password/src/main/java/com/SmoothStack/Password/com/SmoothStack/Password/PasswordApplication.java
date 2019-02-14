package com.SmoothStack.Password.com.SmoothStack.Password;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class PasswordApplication {

	    public static void main(String[] args) throws NoSuchAlgorithmException
	    {
	        String  originalPassword = "Admin1";
	        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
	        System.out.println(generatedSecuredPasswordHash);
	         
	        boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
	        System.out.println(matched);
	    }

}

