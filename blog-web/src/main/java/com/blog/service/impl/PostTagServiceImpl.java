package com.blog.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blog.dao.PostTagDao;
import com.blog.entity.PostTagEntity;
import com.blog.service.PostTagService;


@Service("postTagService")
public class PostTagServiceImpl extends ServiceImpl<PostTagDao, PostTagEntity> implements PostTagService {



}
