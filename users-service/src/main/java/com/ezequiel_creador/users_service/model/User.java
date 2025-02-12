package com.ezequiel_creador.users_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long user_id;
    private String name;
    private String lastname;
    private String cellphone;

    public User() {
    }

    public User(Long user_id, String name, String lastname, String cellphone) {
        this.user_id = user_id;
        this.name = name;
        this.lastname = lastname;
        this.cellphone = cellphone;
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
}
