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
public class Client {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id_client")
    private String id;
    @Column(name = "client_name")
    private String name;
    @Column(name = "client_last_name")
    private String last_name;
    @Column(name = "client_email")
    private String email;
    @Column(name = "client_address")
    private String address;

}
