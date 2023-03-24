package com.project.luxurykittensproject.dto;

import com.project.luxurykittensproject.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Setter
@Getter
@NoArgsConstructor
public class AddressDTO {

    private String state;
    private String city;
    private String street;
    private int zipCode;
    private User user;

    public AddressDTO(String state, String city, String street, int zipCode) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
}
