package com.strale_vule.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends EntityPerson implements Serializable{
    @ManyToOne
    DoctorType type;
}
