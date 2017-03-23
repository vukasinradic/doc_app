package com.strale_vule.persistance.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@NoArgsConstructor
public class EntityPerson extends EntityBase {
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "city")
    private String city;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
}
