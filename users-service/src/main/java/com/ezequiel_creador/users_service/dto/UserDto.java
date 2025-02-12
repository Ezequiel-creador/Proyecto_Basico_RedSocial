package com.ezequiel_creador.users_service.dto;


import java.util.List;



public class UserDto {
    private Long user_id;
    private String name;
    private String lastname;
    private String cellphone;
    private List<PostDto> postList;

    public UserDto() {
    }

    public UserDto(Long user_id, String name, String lastname, String cellphone, List<PostDto> postList) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
        this.postList = postList;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public List<PostDto> getPostList() {
        return postList;
    }

    public void setPostList(List<PostDto> postList) {
        postList = postList;
    }
}
