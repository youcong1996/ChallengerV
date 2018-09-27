<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>文章发布</title>
<meta name="keywords" content="前端模板">
<meta name="description" content="前端模板">

<script src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/index.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/freezeheader.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/lay/modules/layer.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/sliders.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/html5.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/article_pub.js" type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/modules/layer/default/layer.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/global.css"/>
</head>
<body>
<%@include file="header.jsp" %>

<div class="layui-container container">
      <h2 class="page-title">发表文章</h2>
    <div class="layui-form layui-form-pane">
      <form action="#" method="post">
          <div class="layui-form-item">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-block">
              <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
            </div>
          </div>
          
          <div class="layui-form-item layui-form-text">
            <div class="layui-input-block">
              <textarea id="content" name="content" lay-verify="content" placeholder="请输入内容" class="layui-textarea layui-hide"></textarea>
            </div>
          </div>
          
          <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">文章分类</label>
                    <div class="layui-input-block">
                        <select name="type" lay-verify="type">
                            <option value=""></option>
                            <option value="0">写作</option>
                            <option value="1">阅读</option>
                            <option value="2">游戏</option>
                            <option value="3">音乐</option>
                            <option value="4">旅行</option>
                        </select>
                    </div>
                </div>
                
                <div class="layui-inline">
                    <label class="layui-form-label">验证码</label>
                    <div class="layui-input-block">
                     <input type="text" name="code" lay-verify="code" autocomplete="off" placeholder="验证码" class="layui-input">
                    </div>
                </div>
            </div>

            <div class="layui-form-item">
              <button class="layui-btn" lay-filter="*" lay-submit>立即发布</button>
            </div>
      </form>
    </div>
</div>
 <!-- footer -->
 <%@include file="footer.jsp" %>
 </body>
</html>