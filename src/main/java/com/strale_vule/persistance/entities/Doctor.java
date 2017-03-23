package com.strale_vule.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "doctor_id")
    private String id;
    @Column(name = "doctor_name")
    private String name;
    @Column(name = "doctor_last_name")
    private String lastName;
    @Column(name = "doctor_city")
    private String city;
    @Column(name = "doctor_address")
    private String address;
    @Column(name = "doctor_email")
    private String email;
    @Column(name = "doctor_password")
    private String password;
    @Column(name = "doctor_phone")
    private String phone;
    @ManyToOne
    DoctorType type;
}
