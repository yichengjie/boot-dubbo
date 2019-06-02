package com.yicj.study.consume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yicj.study.api.entity.User;
import com.yicj.study.api.service.IUserService;
import com.yicj.study.consume.vo.BaseResponse;

@RestController
public class IndexController {
	
	@Autowired
	private IUserService userService ;

    @GetMapping
    public BaseResponse<List<User>> index(){
    	List<User> list = userService.list() ;
        return BaseResponse.success(list) ;
    }
    
}
