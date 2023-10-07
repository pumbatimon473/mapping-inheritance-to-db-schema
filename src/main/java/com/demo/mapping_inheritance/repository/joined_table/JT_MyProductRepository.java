package com.demo.mapping_inheritance.repository.joined_table;

import com.demo.mapping_inheritance.strategy.joined_table.MyProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JT_MyProductRepository extends JpaRepository<MyProduct, Long> {
    @Override
    <S extends MyProduct> S save(S entity);

    @Override
    Optional<MyProduct> findById(Long aLong);
}
