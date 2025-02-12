package com.ezequiel_creador.posts_service.service;

import com.ezequiel_creador.posts_service.model.Post;
import com.ezequiel_creador.posts_service.repository.IPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService implements IPostsService {
    @Autowired
    private IPostsRepository iPostsRepository;

    @Override
    public List<Post> getPostById(Long id) {
        return iPostsRepository.findByPostsById(id);
    }
}
