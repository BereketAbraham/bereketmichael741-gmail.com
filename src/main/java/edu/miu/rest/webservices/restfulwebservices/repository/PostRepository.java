package edu.miu.rest.webservices.restfulwebservices.repository;

import edu.miu.rest.webservices.restfulwebservices.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
