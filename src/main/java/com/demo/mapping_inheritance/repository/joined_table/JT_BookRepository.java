package com.demo.mapping_inheritance.repository.joined_table;

import com.demo.mapping_inheritance.strategy.joined_table.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JT_BookRepository extends JpaRepository<Book, Long> {
    @Override
    <S extends Book> S save(S entity);

    @Override
    Optional<Book> findById(Long aLong);
}
