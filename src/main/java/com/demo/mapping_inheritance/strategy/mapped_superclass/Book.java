package com.demo.mapping_inheritance.strategy.mapped_superclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_book")
public class Book extends MyProduct {
    // Fields
    private String author;

}
