package com.ezequiel_creador.posts_service.repository;

import com.ezequiel_creador.posts_service.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPostsRepository extends JpaRepository<Post, Long> {

    @Query ("SELECT p FROM Post p WHERE p.user_id = :user_id")
    List<Post> findByPostsById(Long user_id);
}
