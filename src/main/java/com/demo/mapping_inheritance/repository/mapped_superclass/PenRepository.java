package com.demo.mapping_inheritance.repository.mapped_superclass;

import com.demo.mapping_inheritance.strategy.mapped_superclass.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PenRepository extends JpaRepository<Pen, Long> {
    @Override
    <S extends Pen> S save(S entity);

    @Override
    Optional<Pen> findById(Long aLong);
}
