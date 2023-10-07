package com.demo.mapping_inheritance.strategy.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Camera")
public class Camera extends MyProduct {
    // Fields
    private Double sensor;  // in megapixel
}
