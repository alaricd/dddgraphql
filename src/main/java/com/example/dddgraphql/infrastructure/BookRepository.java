
package com.example.dddgraphql.infrastructure;

import com.example.dddgraphql.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
