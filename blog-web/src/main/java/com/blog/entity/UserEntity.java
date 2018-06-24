package com.blog.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:01
 */
@TableName("user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId(type=IdType.AUTO)
	private Integer user_id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 性别
	 */
	private String sex;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 等级
	 */
	private Integer level;
	/**
	 * 用户创建时间
	 */
	@TableField(value="create_time")
	private String createTime;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 登录标识
	 */

	private Integer logo;

	/**
	 * 设置：用户ID
	 */
	public void setUserId(Integer user_id) {
		this.user_id = user_id;
	}
	/**
	 * 获取：用户ID
	 */
	public Integer getUserId() {
		return user_id;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：等级
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：等级
	 */
	public Integer getLevel() {
		return level;
	}
	/**
	 * 设置：用户创建时间
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：用户创建时间
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：登录标识
	 */
	public void setLogo(Integer logo) {
		this.logo = logo;
	}
	/**
	 * 获取：登录标识
	 */
	public Integer getLogo() {
		return logo;
	}
}
