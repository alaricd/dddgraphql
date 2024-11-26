
package com.example.dddgraphql.graphql;

import com.example.dddgraphql.application.BookService;
import com.example.dddgraphql.domain.Book;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {
    private final BookService bookService;

    public MutationResolver(BookService bookService) {
        this.bookService = bookService;
    }

    public Book addBook(String title, String author) {
        return bookService.saveBook(title, author);
    }
}
