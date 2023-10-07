package com.demo.mapping_inheritance.strategy.table_per_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_camera")
public class Camera extends MyProduct {
    // Fields
    private Double sensor;  // in megapixel
}
