package com.demo.mapping_inheritance.strategy.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "Pen")
public class Pen extends MyProduct {
    // Fields
    @Enumerated(value = EnumType.STRING)
    private InkColor inkColor;
}
