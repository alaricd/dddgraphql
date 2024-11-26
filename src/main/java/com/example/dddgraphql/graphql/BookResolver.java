
package com.example.dddgraphql.graphql;

import com.example.dddgraphql.application.BookService;
import com.example.dddgraphql.domain.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver {
    private final BookService bookService;

    public BookResolver(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> books() {
        return bookService.findAll();
    }
}
