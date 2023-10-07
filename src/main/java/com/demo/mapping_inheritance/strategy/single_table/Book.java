package com.demo.mapping_inheritance.strategy.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Book")
public class Book extends MyProduct {
    // Fields
    private String author;

}
