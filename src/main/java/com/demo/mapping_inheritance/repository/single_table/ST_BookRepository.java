package com.demo.mapping_inheritance.repository.single_table;

import com.demo.mapping_inheritance.strategy.single_table.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ST_BookRepository extends JpaRepository<Book, Long> {
    @Override
    <S extends Book> S save(S entity);

    @Override
    Optional<Book> findById(Long aLong);
}
