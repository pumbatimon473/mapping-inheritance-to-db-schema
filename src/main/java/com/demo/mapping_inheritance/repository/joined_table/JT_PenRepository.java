package com.demo.mapping_inheritance.repository.joined_table;

import com.demo.mapping_inheritance.strategy.joined_table.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JT_PenRepository extends JpaRepository<Pen, Long> {
    @Override
    <S extends Pen> S save(S entity);

    @Override
    Optional<Pen> findById(Long aLong);
}
