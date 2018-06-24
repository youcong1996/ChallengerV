package com.blog.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.blog.dao.PostDao;
import com.blog.entity.PostEntity;
import com.blog.service.PostService;
import com.blog.utils.PageBean;


@Service("postService")
public class PostServiceImpl extends ServiceImpl<PostDao, PostEntity> implements PostService {

	
	@Autowired
	private PostDao postDao;

	@Override
	public List<PostEntity> selectPostListInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return postDao.selectPostListInfo(map);
	}

	@Override
	public int selectPostInfoCount() {
		// TODO Auto-generated method stub
		return postDao.selectPostInfoCount();
	}
	
	





	


}
