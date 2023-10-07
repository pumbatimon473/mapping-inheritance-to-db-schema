package com.demo.mapping_inheritance.repository.mapped_superclass;

import com.demo.mapping_inheritance.strategy.mapped_superclass.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    <S extends Book> S save(S entity);

    @Override
    Optional<Book> findById(Long aLong);

}
