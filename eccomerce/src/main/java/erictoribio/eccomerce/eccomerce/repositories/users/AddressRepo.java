package erictoribio.eccomerce.eccomerce.repositories.users;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import erictoribio.eccomerce.eccomerce.entity.users.Address;
@Repository
public interface AddressRepo extends CrudRepository<Address, Long> {

    List<Address> findAll();
    
}
