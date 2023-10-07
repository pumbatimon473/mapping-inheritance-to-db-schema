package com.demo.mapping_inheritance.strategy.mapped_superclass;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "msc_pen")
public class Pen extends MyProduct {
    // Fields
    @Enumerated(value = EnumType.STRING)
    private InkColor inkColor;
}
