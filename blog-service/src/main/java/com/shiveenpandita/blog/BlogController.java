package com.shiveenpandita.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping(path = "/api/blog")
public class BlogController {
    private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

    private BlogRepository blogRepository;

    @Autowired
    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @PostMapping("saveBlog")
    public @ResponseBody
    ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        Blog blogToSave = new Blog();
        blogToSave.setTitle(blog.getTitle());
        blogToSave.setBody(blog.getBody());
        blogToSave.setModifiedDtTm(LocalDateTime.now());
        logger.info("About to save the received blog {}", blogToSave);
        Blog blogSaved = blogRepository.save(blogToSave);
        logger.info("Saved the blog entry {}", blogSaved);
        return new ResponseEntity<>(blogSaved, HttpStatus.OK);
    }

    @GetMapping("getAllBlogs")
    public @ResponseBody
    List<Blog> getAllBlogs() {
        logger.info("Returning all blogs");
        return blogRepository.findAll();
    }

    @GetMapping("getBlogByTitle")
    public @ResponseBody
    List<Blog> getByTitle(@RequestParam(value = "title") String title) {
        logger.info("Getting all blogs with title {}", title);
        return blogRepository.findByTitle(title);
    }

    @PostMapping("deleteBlogById")
    public ResponseEntity<HttpStatus> deleteBlogById(@RequestParam(value = "id") String id){
        try {
            blogRepository.deleteBlogById(id);
            logger.info("Successfully deleted post with Id {}", id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error deleting blog with id {}", id, e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("deleteBlogByTitle")
    public ResponseEntity<HttpStatus> deleteBlogByTitle(@RequestParam(value = "title") String title){
        try {
            blogRepository.deleteBlogByTitle(title);
            logger.info("Successfully deleted post with title {}", title);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error deleting blog with title {}", title, e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

