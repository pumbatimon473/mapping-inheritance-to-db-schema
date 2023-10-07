package com.demo.mapping_inheritance.ref_hierarchy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Camera extends MyProduct {
    // Fields
    private Double sensor;  // in megapixel
}
