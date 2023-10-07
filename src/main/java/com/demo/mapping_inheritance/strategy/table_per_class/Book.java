package com.demo.mapping_inheritance.strategy.table_per_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_book")
public class Book extends MyProduct {
    // Fields
    private String author;

}
