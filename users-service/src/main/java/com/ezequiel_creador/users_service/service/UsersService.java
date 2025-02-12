package com.ezequiel_creador.users_service.service;


import com.ezequiel_creador.users_service.dto.PostDto;
import com.ezequiel_creador.users_service.dto.UserDto;
import com.ezequiel_creador.users_service.model.User;
import com.ezequiel_creador.users_service.repository.IApiPost;
import com.ezequiel_creador.users_service.repository.IUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private IUsersRepository iUsersRepository;
    @Autowired
    private IApiPost iApiPost;

    @Override
    public UserDto getUsersPost(Long user_id) {
        User user = iUsersRepository.findById(user_id).orElse(null);
        List<PostDto> postDtoList = iApiPost.findPostsById(user_id);
        UserDto userDto= new UserDto(user.getUser_id(), user.getName(), user.getLastname(),user.getCellphone(),postDtoList);
        return userDto;
    }
}
