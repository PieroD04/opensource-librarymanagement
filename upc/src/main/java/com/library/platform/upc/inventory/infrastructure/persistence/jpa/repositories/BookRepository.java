package com.library.platform.upc.inventory.infrastructure.persistence.jpa.repositories;

import com.library.platform.upc.inventory.domain.model.aggregates.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
