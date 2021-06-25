package com.bala.microServices.UserMicroService.vo;

import com.bala.microServices.UserMicroService.model.Department;
import com.bala.microServices.UserMicroService.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}

