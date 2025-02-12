package com.ezequiel_creador.posts_service.service;

import com.ezequiel_creador.posts_service.model.Post;

import java.util.List;

public interface IPostsService {
    public List<Post> getPostById(Long id);
}
