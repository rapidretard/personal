package com.shiveenpandita.blog;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BlogRepository extends MongoRepository<Blog, String> {

    List<Blog> findByTitle(String title);

    List<Blog> findAll();

    void deleteBlogById(String id);

    void deleteBlogByTitle(String title);

}
