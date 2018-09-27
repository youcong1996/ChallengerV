package com.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blog.dao.UserDao;
import com.blog.entity.UserEntity;
import com.blog.service.UserService;


@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public boolean insertUserEntity(UserEntity userEntity) {
		// TODO Auto-generated method stub
		return userDao.insertUserEntity(userEntity);
	}


}
