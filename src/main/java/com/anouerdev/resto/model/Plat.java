
package com.anouerdev.resto.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

//To use the @Data annotation you should add the Lombok dependency.
@Data
@Entity
@DiscriminatorValue(value = "plat")
class Plat extends Met{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

