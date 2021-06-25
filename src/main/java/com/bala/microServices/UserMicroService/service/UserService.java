package com.bala.microServices.UserMicroService.service;

import com.bala.microServices.UserMicroService.model.Department;
import com.bala.microServices.UserMicroService.model.User;
import com.bala.microServices.UserMicroService.repository.UserRepository;
import com.bala.microServices.UserMicroService.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
   private UserRepository repo;

    @Autowired
    private RestTemplate template;

    public User saveUser(User user){
       return repo.save(user) ;
    }

    public User findUserById(int id){
        return repo.findByUserId(id);
    }


    public ResponseTemplateVO findUserWithDepartment(int userId){
     ResponseTemplateVO vo=new ResponseTemplateVO();
     User user=repo.findByUserId(userId);
        Department department=template.getForObject("http://localhost:9001/api/department/"+user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
