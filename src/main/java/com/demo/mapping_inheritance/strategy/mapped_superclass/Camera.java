package com.demo.mapping_inheritance.strategy.mapped_superclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_camera")
public class Camera extends MyProduct {
    // Fields
    private Double sensor;  // in megapixel
}
