package com.demo.mapping_inheritance.ref_hierarchy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pen extends MyProduct {
    // Fields
    private InkColor inkColor;
}
