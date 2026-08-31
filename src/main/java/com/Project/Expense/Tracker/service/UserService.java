package com.Project.Expense.Tracker.service;

	import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.stereotype.Service;

	import com.Project.Expense.Tracker.model.User;
	import com.Project.Expense.Tracker.repository.UserRepository;

	@Service
	public class UserService {

	    private UserRepository userRepository;
	    private PasswordEncoder passwordEncoder;

	    public UserService(UserRepository userRepository,
	                       PasswordEncoder passwordEncoder) {
	        this.userRepository = userRepository;
	        this.passwordEncoder = passwordEncoder;
	    }

	    public User registerUser(User user) {

	        String encodedPassword = passwordEncoder.encode(user.getPassword());

	        user.setPassword(encodedPassword);

	        return userRepository.save(user);
	    }
	}
