package com.gsrk.graphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.gsrk.graphql.model.Author;

public interface AuthorRepository  extends CrudRepository<Author, Long> {

}
