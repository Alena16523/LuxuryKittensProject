package com.project.luxurykittensproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address extends BaseEntity{

    private String state;
    private String city;
    private String street;
    private int zipCode;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Address(String state, String city, String street, int zipCode) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
