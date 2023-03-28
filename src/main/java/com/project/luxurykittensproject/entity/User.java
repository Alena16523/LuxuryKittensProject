package com.project.luxurykittensproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"kittenSalePosts", "meetings"})
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
    private String registrationTicaId;
    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "approved")
    private boolean approved;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<KittenPost> kittenSalePosts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Meeting> meetings;

    @ManyToMany(fetch = FetchType.EAGER)
    //The fetch attribute is set to EAGER to ensure that the roles are always
    // loaded when the user is loaded from the database.
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(String firstName, String lastName, String email, Long phoneNumber, String registrationTicaId, String password, Set<Role> roles, boolean approved) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationTicaId = registrationTicaId;
        this.password = password;
        this.roles = roles;
        this.createdAt = LocalDateTime.now();
        this.approved = approved;
    }


}
