package com.demo.mapping_inheritance.strategy.joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_camera")
@PrimaryKeyJoinColumn(name = "cameraId")    // Overrides the default name for the primary key column which is inherited from the base class
public class Camera extends MyProduct {
    // Fields
    private Double sensor;  // in megapixel
}
