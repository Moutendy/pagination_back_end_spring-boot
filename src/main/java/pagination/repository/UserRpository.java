package pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pagination.model.Users;
@Repository
public interface UserRpository extends JpaRepository <Users,Long>{

}
 