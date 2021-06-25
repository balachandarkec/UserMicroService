package com.bala.microServices.UserMicroService.repository;

import com.bala.microServices.UserMicroService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByUserId(int id);
}
