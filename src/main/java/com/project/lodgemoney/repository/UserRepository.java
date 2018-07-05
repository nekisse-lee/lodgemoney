package com.project.lodgemoney.repository;

import com.project.lodgemoney.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {


}
