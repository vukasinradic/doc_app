package com.strale_vule.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorType {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id_doctor_type")
    private String id;
    @Column(name = "doctor_type_name")
    private String name;
}
