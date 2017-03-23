package com.strale_vule.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by user on 3/23/2017.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Service extends EntityBase implements Serializable {

    private double price;
}
