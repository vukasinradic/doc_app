package com.strale_vule.persistance.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 3/23/2017.
 */
@MappedSuperclass
@Data
@Entity
public class EntityBase implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
}
