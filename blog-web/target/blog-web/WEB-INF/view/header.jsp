<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="layui-header header">
  <div class="main">
    <ul class="layui-nav layui-nav-left" lay-filter="filter">
      <a class="logo" href="${pageContext.request.contextPath}/" title="Fly">ChallengerV博客系统</a>
      <li class="layui-nav-item layui-this nav-left">
        <a href="${pageContext.request.contextPath}/">首页</a>
      </li>
      <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/article">文章</a>
      </li>
      <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/time_line">时间轴</a>
      </li>
      <li class="layui-nav-item">
        <a href="${pageContext.request.contextPath}/time_line">相册</a>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right layui-nav-right" lay-filter="filter">

      <li class="layui-nav-item">
        <a href="home.html">我的主页<span class="layui-badge-dot"></span></a>
      </li>
      <li class="layui-nav-item">
        <a href="javascript:;"><img src="${pageContext.request.contextPath}/static/images/head.jpg" class="layui-nav-img">我</a>
        <dl class="layui-nav-child">
			<dd><a href="${pageContext.request.contextPath}/article_pub">文章发布</a></dd>
          	<dd><a href="${pageContext.request.contextPath}/set">修改信息</a></dd>
            <dd><a href="javascript:;">退了</a></dd>
        </dl>
      </li>
    </ul>
  </div>
</div>