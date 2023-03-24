package com.project.luxurykittensproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "roles")
public class Role extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    public static final Role ADMIN = new Role("admin");

    @ManyToOne
    @JoinColumn(name = "breeder_id")
    public static final Role BREEDER = new Role("breeder");


}