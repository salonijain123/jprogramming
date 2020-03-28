package com.devglan.springboothibernatelogin;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserService {

	
	
		public ApiResponse signUp(SignUpDto signupDto);

		public ApiResponse login(LoginDto loginDto);

}
