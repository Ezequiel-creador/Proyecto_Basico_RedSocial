package com.ezequiel_creador.users_service.service;

import com.ezequiel_creador.users_service.dto.PostDto;
import com.ezequiel_creador.users_service.dto.UserDto;

public interface IUsersService {
    public UserDto getUsersPost(Long user_id);
}
