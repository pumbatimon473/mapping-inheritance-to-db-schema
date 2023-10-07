package com.demo.mapping_inheritance.repository.table_per_class;

import com.demo.mapping_inheritance.strategy.table_per_class.Pen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TPC_PenRepository extends JpaRepository<Pen, Long> {
    @Override
    <S extends Pen> S save(S entity);

    @Override
    Optional<Pen> findById(Long aLong);
}
