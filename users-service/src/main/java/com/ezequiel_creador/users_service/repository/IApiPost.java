package com.ezequiel_creador.users_service.repository;

import com.ezequiel_creador.users_service.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient (name = "posts-service")
public interface IApiPost {
    @GetMapping ("/posts/{user_id}")
    public List<PostDto> findPostsById(@PathVariable ("user_id")Long user_id);
    }

