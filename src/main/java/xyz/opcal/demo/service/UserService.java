package xyz.opcal.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.opcal.demo.domain.User;
import xyz.opcal.demo.repository.UserRepository;

@Service
public class UserService {

	private @Autowired UserRepository userRepository;

	public User save(User user) {
		// mock some logic
		return userRepository.save(user);
	}

	public Iterable<User> all() {
		// mock some logic
		return userRepository.findAll();
	}
}
