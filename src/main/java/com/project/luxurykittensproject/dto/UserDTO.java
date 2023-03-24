package com.project.luxurykittensproject.dto;

import com.project.luxurykittensproject.entity.KittenPost;
import com.project.luxurykittensproject.entity.Meeting;
import com.project.luxurykittensproject.entity.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    //will act like user name
    private String registrationTicaId;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;

    private List<KittenPost> kittenSalePosts;

    private List<Meeting> meetings;

    private Set<RoleDTO> roles;

    private AddressDTO addressDTO;

    public UserDTO(String firstName, String lastName, String email, int phoneNumber, String registrationTicaId, String password, Set<RoleDTO> roles, AddressDTO addressDTO) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationTicaId = registrationTicaId;
        this.password = password;
        this.roles = roles;
        this.createdAt = LocalDateTime.now();
        this.addressDTO=addressDTO;
    }
}
