package net.javaguides.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.models.Role;
import net.javaguides.springboot.models.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.web.dto.UserRegistration;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;
	

	@Override
	public User save(UserRegistration registration) {
		User user = new User(registration.getLastName(), registration.getFirstName(), registration.getEmail(), registration.getPassword(), 
				Arrays.asList(new Role("ROLE_USER")));
	
		return repository.save(user);
	}

}
