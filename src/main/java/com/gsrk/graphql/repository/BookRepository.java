package com.gsrk.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.gsrk.graphql.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
