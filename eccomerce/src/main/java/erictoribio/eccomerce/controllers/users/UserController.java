package erictoribio.eccomerce.controllers.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import erictoribio.eccomerce.eccomerce.services.users.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired UserService userService;
    
}
