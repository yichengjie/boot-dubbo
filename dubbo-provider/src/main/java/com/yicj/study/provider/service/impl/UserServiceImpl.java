package com.yicj.study.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yicj.study.provider.entity.User;
import com.yicj.study.provider.mapper.UserMapper;
import com.yicj.study.provider.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

}
