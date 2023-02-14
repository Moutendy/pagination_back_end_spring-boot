package pagination.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pagination.model.Users;
import pagination.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	  private final UserService userService;

	  public UserController(UserService userService) {
	    this.userService = userService;
	  }
	  
	  @GetMapping("/employees")
	  public ResponseEntity<Page<Users>> getAllEmployees(Pageable pageable) {
	    Page<Users> page = userService.getAllUser(pageable);
	    return new ResponseEntity<>(page, HttpStatus.OK);
	  }
	  
}
