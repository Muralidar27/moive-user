package com.slokam.moive.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.moive.user.pojo.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
