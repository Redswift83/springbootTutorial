package eu.pontsystems.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eu.pontsystems.tutorial.entity.User;
import eu.pontsystems.tutorial.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository ur;

	public void mentes(User user) {
		ur.save(user);
	}
	
	public List<User> osszesUser(){
		
		return ur.findAll();
		
	}
	
	
}
