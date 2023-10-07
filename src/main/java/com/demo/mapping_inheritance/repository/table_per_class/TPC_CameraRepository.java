package com.demo.mapping_inheritance.repository.table_per_class;

import com.demo.mapping_inheritance.strategy.table_per_class.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TPC_CameraRepository extends JpaRepository<Camera, Long> {
    @Override
    <S extends Camera> S save(S entity);

    @Override
    Optional<Camera> findById(Long aLong);
}
