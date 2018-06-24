package com.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.blog.cutomer.utils.Tools;
import com.blog.entity.UserEntity;
import com.blog.service.UserService;
import com.blog.utils.CookieUtils;
import com.blog.utils.DateUtils;
import com.blog.utils.DesUtils;

/**
 * 
 *
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:01
 */
@RestController
@RequestMapping("/user")
public class UserController {

	// 日志打印
	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired 
	private UserService userService;  
	  
	@PostMapping(value="/login",produces="application/json;charset=utf-8")
	@ResponseBody
	public String login(String email,String password,HttpServletResponse response,Map<String,Object> returnMap) {
		
		//打印前台数据
		logger.info("email:"+email);
		logger.info("password:"+password);
		
		//通过邮箱获取用户信息
		EntityWrapper<UserEntity> loginCondition = new EntityWrapper<UserEntity>();
		loginCondition.eq("email", email);
		UserEntity user = userService.selectOne(loginCondition);
		//Cookie加密
		CookieUtils.setCookie(response, "userId", DesUtils.encode(String.valueOf(user.getUserId()), "userId"));
		 
		
		//条件判断
		if(user.getEmail()==null) {
			returnMap.put("returnCode", "333333");
			returnMap.put("returnMsg", "用户不存在");
		}else if(!Tools.checkPwd(password, user.getPassword())) {
			returnMap.put("returnCode", "222222");
			returnMap.put("returnMsg", "密码错误");
		}else if(user.getLogo().equals(0)) {
			returnMap.put("returnCode", "111111");
			returnMap.put("returnMsg", "账户未激活,禁止登陆");
		}else if(user.getLevel().equals(5)) {
		
			returnMap.put("returnCode", "000000");
			returnMap.put("returnMsg", "进入管理员界面");
		}else{
			
		}
		
		//返回结果数据到前台
		return JSON.toJSONString(returnMap);
	}
	
	@PostMapping(value="/register",produces="application/json;charset=utf-8")
	@ResponseBody
	public String register(@RequestBody UserEntity userEntity){
		
		Map<String,Object> returnMap = new HashMap<String,Object>();
		logger.info("----start----");
		logger.info("登录账户:"+userEntity.getEmail());
		logger.info("用户名:"+userEntity.getUsername());
		logger.info("性别:"+userEntity.getSex());
		logger.info("密码:"+userEntity.getPassword());
		logger.info("----end----");
		//验证邮箱
		EntityWrapper<UserEntity> wrapper = new EntityWrapper<UserEntity>();
		wrapper.eq("email", userEntity.getEmail());
		UserEntity validateEmail = userService.selectOne(wrapper);
		logger.info("validateEmail:"+validateEmail);
		
		//条件校验 校验邮箱和用户名是否存在
	if(validateEmail!=null) {
			returnMap.put("returnCode", "333333");
			returnMap.put("returnMsg", "该邮箱已经注册过,同一个邮箱不能注册多次");
		}else{
		

			UserEntity u = new UserEntity();
			//logo为0表示未激活状态
			u .setLogo(0);
			u .setCreateTime(DateUtils.getDateTime());
			u .setEmail(userEntity.getEmail());
			u.setPassword(Tools.bcryptPwd(userEntity.getPassword()));
			u.setSex(userEntity.getSex());
			u.setUsername(userEntity.getUsername());
			
			//调用注册方法
			boolean isAdd = userService.insert(u);
			
			if(isAdd) {
				//注册成功,查询用户邮箱并给用户发送邮件

				returnMap.put("email", userEntity.getEmail());
				returnMap.put("returnCode", "000000");
				returnMap.put("returnMsg", "注册成功,邮件已经下发到你的邮箱,请注意查收");
			}else {
				returnMap.put("returnCode", "111111");
				returnMap.put("returnMsg", "注册失败");
			}
		
		}
		//返回结果数据到前台
		return JSON.toJSONString(returnMap);
		
		
	}


}
