package com.demo.mapping_inheritance.strategy.joined_table;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_book")
public class Book extends MyProduct {
    // Fields
    private String author;

}
