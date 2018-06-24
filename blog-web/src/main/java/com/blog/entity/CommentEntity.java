package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:11
 */
@TableName("comment")
public class CommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 评论ID
	 */
	@TableId
	private Integer comment_id;
	/**
	 * 评论内容
	 */
	@TableField("comment_content")
	private String commentContent;
	/**
	 * 创建时间
	 */
	@TableField("comment_create_time")
	private Date commentCreateTime;
	/**
	 * 用户ID
	 */
	@TableField("user_id")
	private Integer userId;
	/**
	 * 文章ID
	 */
	@TableField("post_id")
	private Integer postId;

	/**
	 * 设置：评论ID
	 */
	public void setCommentId(Integer comment_id) {
		this.comment_id = comment_id;
	}
	/**
	 * 获取：评论ID
	 */
	public Integer getCommentId() {
		return comment_id;
	}
	/**
	 * 设置：评论内容
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	/**
	 * 获取：评论内容
	 */
	public String getCommentContent() {
		return commentContent;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCommentCreateTime(Date commentCreateTime) {
		this.commentCreateTime = commentCreateTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCommentCreateTime() {
		return commentCreateTime;
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
}
