package com.blog.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blog.bean.ResponseBean;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import cn.hutool.json.JSONUtil;

/**
 * 异常处理
 * @author 唐沙沙
 * @since 2018-07-2
 */
@Api(value="错误处理")
@Controller
@RequestMapping("/error")
public class ErrorController {
	private Logger logger = Logger.getLogger(ErrorController.class);
	
	
	@RequestMapping(value = "/unauthorized", method = RequestMethod.POST,produces="application/json;charset=utf-8")
    @ApiOperation(value="没有权限访问异常处理",httpMethod="POST",notes="访问接口时没有权限,跳转到此方法")  
	@ResponseBody
	public String unauthorized() {
	
		logger.info("没有权限");
		ResponseBean response = new ResponseBean();
	    response.setCode("000998");
    	response.setMsg("没有权限");
		
		return JSONUtil.toJsonStr(response);
	}
	
	
	@RequestMapping(value = "/unlogined", method = RequestMethod.POST,produces="application/json;charset=utf-8")
    @ApiOperation(value="没有登录处理",httpMethod="POST",notes="访问接口市没有登录时，跳转到此方法")  
	@ResponseBody
	public String unlogined() {
	
		logger.info("没有登录");
		ResponseBean response = new ResponseBean();
	    response.setCode("000999");
    	response.setMsg("没有登录");
		
		return JSONUtil.toJsonStr(response);
	}

}

