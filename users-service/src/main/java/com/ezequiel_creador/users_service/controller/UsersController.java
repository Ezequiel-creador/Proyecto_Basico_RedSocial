package com.ezequiel_creador.users_service.controller;

import com.ezequiel_creador.users_service.dto.UserDto;
import com.ezequiel_creador.users_service.service.IUsersService;
import com.ezequiel_creador.users_service.service.UsersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/users")
public class UsersController {
    @Autowired
    public IUsersService usersService;

    @Operation(summary = "Obtiene los posts de un usuario por ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Operación exitosa"),
            @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    @GetMapping ("/posts/{user_id}")
    public UserDto getUsersPosts(@PathVariable Long user_id){
        UserDto user = usersService.getUsersPost(user_id);
        return user;
    }
}
