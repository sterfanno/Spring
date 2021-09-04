package com.ssrc.labv1.repository;

import com.ssrc.labv1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByEmailNameOrEmail(String nome) ;
}
