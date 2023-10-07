package com.demo.mapping_inheritance.repository.table_per_class;

import com.demo.mapping_inheritance.strategy.table_per_class.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TPC_MyProductRepository extends JpaRepository<MyProduct, Long> {
    @Override
    <S extends MyProduct> S save(S entity);

    @Override
    Optional<MyProduct> findById(Long aLong);
}
