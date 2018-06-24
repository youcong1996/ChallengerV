package com.blog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.blog.cutomer.utils.JsonResult;
import com.blog.entity.PostEntity;
import com.blog.service.PostService;



/**
 * 
 *
 * @author youcong
 * @email ${email}
 * @date 2018-04-21 15:27:11
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController{
    
	@Autowired
	private PostService postService;

	
	@PostMapping(value="/list",produces="application/json;charset=utf-8")
	public String list() {		
		
		Map<String,Object> parmMap = new HashMap<String,Object>();
		parmMap.put("start", 0);
		parmMap.put("size", 10);
		List<PostEntity> pList = postService.selectPostListInfo(parmMap);
			
		int lines = postService.selectPostInfoCount();	
	        
		Map<String,Object> returnMap = new HashMap<String,Object>();
		if(!pList.isEmpty() && lines!=0) {
			returnMap.put("pList", pList);
			returnMap.put("returnCode", "000000");
			returnMap.put("returnMsg", "success");
		}else {
			
			returnMap.put("returnCode", "111111");
			returnMap.put("returnMsg", "error");
		}
		
		return JSON.toJSONString(returnMap);
	}
	    
	
	/**
	 * 添加文章
	 * @param postEntity
	 * @return
	 */
	@PostMapping(value="/add",produces="application/json;charset=utf-8")
	@ResponseBody
	public JsonResult add(@RequestBody PostEntity postEntity) {
		
		return postService.insert(postEntity)?renderSuccess("添加成功"):renderError("添加失败");		
	}
	
	
	/**
	 * 删除文章
	 * @param post_id
	 * @return
	 */
	@PostMapping(value="/delete",produces="application/json;charset=utf-8")
	@ResponseBody
	public JsonResult delete(@RequestBody Integer post_id) {
		
		return postService.deleteById(post_id)?renderSuccess("删除成功"):renderError("删除失败");		
	}
	
	
	


}