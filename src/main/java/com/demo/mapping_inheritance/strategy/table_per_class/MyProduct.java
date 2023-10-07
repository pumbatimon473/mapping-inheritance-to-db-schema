package com.demo.mapping_inheritance.strategy.table_per_class;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_product")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class MyProduct {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private String name;
}
