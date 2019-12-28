package cl.thisisalexis.user.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("User API")
@RestController
@RequestMapping(value = "/users")
public class UserApiController {

	// TODO implement this method
	@ApiOperation("User login")
	@PostMapping(value = "/login") 
	public ResponseEntity<UserDetails> login(@RequestBody UserDetails userDetails) {
		return ResponseEntity.ok(new User(userDetails.getUsername(), userDetails.getPassword(), null));
	}
	
	@ApiOperation("User Dashboard")
	@GetMapping(value = "/dashboard")
	public ResponseEntity<String> userDashboard() {
		return ResponseEntity.ok("Welcome");
	}
	
}
