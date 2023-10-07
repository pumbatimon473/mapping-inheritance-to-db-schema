package com.demo.mapping_inheritance.repository.table_per_class;

import com.demo.mapping_inheritance.strategy.table_per_class.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TPC_BookRepository extends JpaRepository<Book, Long> {
    @Override
    <S extends Book> S save(S entity);

    @Override
    Optional<Book> findById(Long aLong);
}
