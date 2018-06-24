package com.blog.dao;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.entity.PostEntity;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:11
 */
public interface PostDao extends BaseMapper<PostEntity> {
	
	/**
	 * 查询所有文章信息
	 * @return
	 */
	List<PostEntity> selectPostListInfo(Map<String,Object> map);
	
	/**
	 * 查询所有文章总数
	 */
	int selectPostInfoCount();
	
}
