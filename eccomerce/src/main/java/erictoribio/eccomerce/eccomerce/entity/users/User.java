package erictoribio.eccomerce.eccomerce.entity.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    
    @Id
    private String emailId;

    private String password;

    @OneToOne(mappedBy = "user")
    private Customer customer;
}
