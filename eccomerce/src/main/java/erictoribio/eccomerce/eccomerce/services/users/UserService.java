package erictoribio.eccomerce.eccomerce.services.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import erictoribio.eccomerce.eccomerce.repositories.users.UserRepo;

@Service
public class UserService {
    @Autowired UserRepo userRepo;
}
