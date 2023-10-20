package com.practice.firstproject.repositrory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.firstproject.modal.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    

}
