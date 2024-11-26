
package com.example.dddgraphql.application;

import com.example.dddgraphql.domain.Book;
import com.example.dddgraphql.infrastructure.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book saveBook(String title, String author) {
        return repository.save(new Book(title, author));
    }
}
