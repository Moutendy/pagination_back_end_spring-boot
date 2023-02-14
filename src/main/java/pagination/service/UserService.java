package pagination.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import pagination.model.Users;


public interface UserService {

	public Page<Users> getAllUser(Pageable pageable);
}
