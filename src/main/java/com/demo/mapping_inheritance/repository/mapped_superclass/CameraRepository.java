package com.demo.mapping_inheritance.repository.mapped_superclass;

import com.demo.mapping_inheritance.strategy.mapped_superclass.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CameraRepository extends JpaRepository<Camera, Long> {
    @Override
    <S extends Camera> S save(S entity);

    @Override
    Optional<Camera> findById(Long aLong);
}
