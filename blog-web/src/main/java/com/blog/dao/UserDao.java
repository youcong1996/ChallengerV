package com.blog.dao;

import java.io.Serializable;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.entity.UserEntity;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:01
 */
public interface UserDao extends BaseMapper<UserEntity> {
	
	boolean insertUserEntity(UserEntity userEntity);
}
