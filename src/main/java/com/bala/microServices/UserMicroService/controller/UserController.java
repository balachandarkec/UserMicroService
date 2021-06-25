package com.bala.microServices.UserMicroService.controller;

import com.bala.microServices.UserMicroService.model.User;
import com.bala.microServices.UserMicroService.service.UserService;
import com.bala.microServices.UserMicroService.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside User Controller SaveUser Method");
        return service.saveUser(user);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDept(@PathVariable("id") int userId){
        log.info("Inside User Controller getUserWithDept Method");
        return service.findUserWithDepartment(userId);
    }



}
