package com.blog.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.lang.annotation.Target;
import java.util.Date;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:11
 */
@TableName("tag")
public class TagEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标签ID
	 */
	@TableId
	private Integer tag_id;
	/**
	 * 标签名
	 */
	@TableField("tag_name")
	private String tagName;
	/**
	 * 标签创建时间
	 */
	@TableField("tag_create_time")
	private Date tagCreateTime;
	/**
	 * 用户ID
	 */
	@TableField("user_id")
	private Integer userId;

	/**
	 * 设置：标签ID
	 */
	public void setTagId(Integer tag_id) {
		this.tag_id = tag_id;
	}
	/**
	 * 获取：标签ID
	 */
	public Integer getTagId() {
		return tag_id;
	}
	/**
	 * 设置：标签名
	 */
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	/**
	 * 获取：标签名
	 */
	public String getTagName() {
		return tagName;
	}
	/**
	 * 设置：标签创建时间
	 */
	public void setTagCreateTime(Date tagCreateTime) {
		this.tagCreateTime = tagCreateTime;
	}
	/**
	 * 获取：标签创建时间
	 */
	public Date getTagCreateTime() {
		return tagCreateTime;
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
