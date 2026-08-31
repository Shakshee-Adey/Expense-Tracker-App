package com.Project.Expense.Tracker.controller;

	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.Project.Expense.Tracker.model.User;
	import com.Project.Expense.Tracker.service.UserService;

	@RestController
	@RequestMapping("/auth")
	public class AuthController {

	    private UserService userService;

	    public AuthController(UserService userService) {
	        this.userService = userService;
	    }

	    @PostMapping("/register")
	    public ResponseEntity<User> register(@RequestBody User user) {

	        User savedUser = userService.registerUser(user);

	        return ResponseEntity.ok(savedUser);
	    }
	}
