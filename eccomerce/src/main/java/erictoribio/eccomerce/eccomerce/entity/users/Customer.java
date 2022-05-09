package erictoribio.eccomerce.eccomerce.entity.users;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter @Setter
@NoArgsConstructor
public class Customer {
    
    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String customerPhone;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address shippingAddress;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Address billingAddress;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;
}
