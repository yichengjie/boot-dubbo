package com.yicj.study.provider.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yicj.study.api.entity.User;
import com.yicj.study.provider.mapper.UserMapper;
import com.yicj.study.api.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {

}
