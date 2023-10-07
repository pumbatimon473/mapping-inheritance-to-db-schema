package com.demo.mapping_inheritance.repository.single_table;

import com.demo.mapping_inheritance.strategy.single_table.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ST_CameraRepository extends JpaRepository<Camera, Long> {
    @Override
    <S extends Camera> S save(S entity);

    @Override
    Optional<Camera> findById(Long aLong);
}
