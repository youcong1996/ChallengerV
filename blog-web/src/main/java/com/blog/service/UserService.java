package com.blog.service;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.IService;
import com.blog.entity.UserEntity;


/**
 * 
 *
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:01
 */

public interface UserService extends IService<UserEntity> {

	boolean insertUserEntity(UserEntity userEntity);
    
}

