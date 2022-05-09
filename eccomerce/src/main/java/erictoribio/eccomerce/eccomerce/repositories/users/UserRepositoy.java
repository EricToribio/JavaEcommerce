package erictoribio.eccomerce.eccomerce.repositories.users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import erictoribio.eccomerce.eccomerce.entity.users.User;

public interface UserRepositoy extends CrudRepository <User, Long>{
    
    List<User> findAll();

    Optional<User> findByEmail(String email);
}
