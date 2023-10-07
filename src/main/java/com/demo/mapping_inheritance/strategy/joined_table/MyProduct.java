package com.demo.mapping_inheritance.strategy.joined_table;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_product")
@Inheritance(strategy = InheritanceType.JOINED)
public class MyProduct {
    // Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
}
