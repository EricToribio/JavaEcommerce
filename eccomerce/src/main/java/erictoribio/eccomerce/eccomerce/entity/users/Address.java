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
@Table(name = "address")
public class Address {
    
    @Id
    private int id;

    private String address;

    private String city;

    private String state;

    private String zipCode;

    private String country;

    @OneToOne(mappedBy = "shippingAddress")
    private Customer shippingAddress;

    @OneToOne(mappedBy = "billingAddress")
    private Customer billingAddress;
}
