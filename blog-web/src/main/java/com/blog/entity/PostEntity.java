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
@TableName("post")
public class PostEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 文章ID
	 */
	@TableId
	private Integer post_id;
	/**
	 * 文章标题
	 */
	private String title;
	/**
	 * 文章内容
	 */
	@TableField("post_content")
	private String postContent;
	/**
	 * 文章创建时间
	 */
	@TableField("post_create_time")
	private Date postCreateTime;
	/**
	 * 用户ID
	 */
	@TableField("user_id")
	private Integer userId;
	
	@TableField(value="user_name",exist=false)
	private String userName;

	/**
	 * 设置：文章ID
	 */
	public void setPostId(Integer post_id) {
		this.post_id = post_id;
	}
	/**
	 * 获取：文章ID
	 */
	public Integer getPostId() {
		return post_id;
	}
	/**
	 * 设置：文章标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：文章标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：文章内容
	 */
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	/**
	 * 获取：文章内容
	 */
	public String getPostContent() {
		return postContent;
	}
	/**
	 * 设置：文章创建时间
	 */
	public void setPostCreateTime(Date postCreateTime) {
		this.postCreateTime = postCreateTime;
	}
	/**
	 * 获取：文章创建时间
	 */
	public Date getPostCreateTime() {
		return postCreateTime;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Integer getUserId() {
		return userId;
	}
}
