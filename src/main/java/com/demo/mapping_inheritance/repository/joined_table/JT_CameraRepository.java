package com.demo.mapping_inheritance.repository.joined_table;

import com.demo.mapping_inheritance.strategy.joined_table.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JT_CameraRepository extends JpaRepository<Camera, Long> {
    @Override
    <S extends Camera> S save(S entity);

    @Override
    Optional<Camera> findById(Long aLong);
}
