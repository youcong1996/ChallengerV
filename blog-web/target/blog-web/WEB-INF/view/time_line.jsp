<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<meta name="keywords" content="前端模板">
<meta name="description" content="前端模板">

<script src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/index.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/freezeheader.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/lay/modules/layer.js" type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/modules/layer/default/layer.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/global.css"/>

<!--
-->
</head>
<body>
	<%@include file="header.jsp" %>
    <div class="layui-container container">
     <div class="layui-row layui-col-space15">
        <div class="layui-col-md9">
          <ul class="layui-timeline">
              <li class="layui-timeline-item">
                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                <div class="layui-timeline-content layui-text">
                  <h3 class="layui-timeline-title">发展历程</h3>
                  <p>
                    一个想法
                  </p>
                </div>
              </li>
              <li class="layui-timeline-item">
                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                <div class="layui-timeline-content layui-text">
                  <h3 class="layui-timeline-title">9月5日</h3>
                  <p>正式开发前端模板</p>
                </div>
              </li>
              <li class="layui-timeline-item">
                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                <div class="layui-timeline-content layui-text">
                  <div class="layui-timeline-title">未来</div>
                  <p>未来很美好</p>
                </div>
              </li>
           </ul>
        </div>
        <div class="layui-col-md3">
          <div class="layui-bg-red">3/12</div>
        </div>
    </div>

<!--分页
<div id="page"></div>
-->
 <!-- footer -->
 <%@include file="footer.jsp" %>

</body>
</html>
