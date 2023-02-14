package pagination.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import pagination.model.Users;
import pagination.repository.UserRpository;
import pagination.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	
	private final UserRpository employeeRepository;

	  public UserServiceImpl(UserRpository employeeRepository) {
	    this.employeeRepository = employeeRepository;
	  }

	
	  
	@Override
	public Page<Users> getAllUser(Pageable pageable) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(pageable);
	}

}
