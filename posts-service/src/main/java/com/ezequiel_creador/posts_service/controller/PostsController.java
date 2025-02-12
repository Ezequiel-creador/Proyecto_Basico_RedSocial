package com.ezequiel_creador.posts_service.controller;

import com.ezequiel_creador.posts_service.model.Post;
import com.ezequiel_creador.posts_service.service.PostsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostsService postsService;

    @Value("${server.port}")
    private int serverPort;

    @Operation(summary = "Obtiene una lista de posts por ID")
    @ApiResponse(responseCode = "200", description = "Lista de posts devuelta exitosamente")


    @GetMapping ("/{user_id}")
    public List<Post> getPostsById(@PathVariable Long user_id){
        System.out.println("Servicio corriendo en el puerto: "+ serverPort);
        return postsService.getPostById(user_id);
    }
}
