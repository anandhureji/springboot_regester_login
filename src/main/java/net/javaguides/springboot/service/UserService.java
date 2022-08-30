package net.javaguides.springboot.service;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.models.User;
import net.javaguides.springboot.web.dto.UserRegistration;

@Service
public interface UserService {
	
	User save(UserRegistration registration);

}
