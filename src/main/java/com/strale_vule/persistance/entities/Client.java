package com.strale_vule.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client extends EntityPerson implements Serializable {

}
