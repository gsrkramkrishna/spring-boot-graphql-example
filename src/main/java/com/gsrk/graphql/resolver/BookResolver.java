package com.gsrk.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.gsrk.graphql.model.Author;
import com.gsrk.graphql.model.Book;
import com.gsrk.graphql.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }
}