package com.ssrc.labv1.repository;

import com.ssrc.labv1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
