package com.blog.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:11
 */
@TableName("post_tag")
public class PostTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增序列ID
	 */
	@TableId
	private Integer id;
	/**
	 * 文章ID
	 */
	@TableField("post_id")
	private Integer postId;
	/**
	 * 标签ID
	 */
	@TableField("tag_id")
	private Integer tagId;

	/**
	 * 设置：自增序列ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：自增序列ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：文章ID
	 */
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	/**
	 * 获取：文章ID
	 */
	public Integer getPostId() {
		return postId;
	}
	/**
	 * 设置：标签ID
	 */
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	/**
	 * 获取：标签ID
	 */
	public Integer getTagId() {
		return tagId;
	}
}
