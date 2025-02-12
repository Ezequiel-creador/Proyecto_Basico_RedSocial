package com.ezequiel_creador.users_service.repository;

import com.ezequiel_creador.users_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepository extends JpaRepository <User , Long> {
}
