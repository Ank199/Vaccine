package com.practice.firstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.firstproject.modal.User;
import com.practice.firstproject.repositrory.UserRepo;

@Service
public class UserServiceIMPL implements UserService {

      @Autowired
     UserRepo obj;



    @Override
    public void addData(User log) {

        obj.save(log);
        
    }



    @Override
    public List<User> fetchUserList() {
 return obj.findAll();
    }




    


 

}