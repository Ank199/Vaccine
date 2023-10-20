package com.practice.firstproject.service;

import java.util.List;

import com.practice.firstproject.modal.User;

public interface UserService {

    public void addData(User log);
    public List<User> fetchUserList();
}
