<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>提示页面</title>
<meta name="keywords" content="前端模板">
<meta name="description" content="前端模板">

<script src="${pageContext.request.contextPath}/static/js/jquery/jquery-2.1.4.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/layui.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/index.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/freezeheader.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/layui/lay/modules/layer.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/sliders.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/js/index/html5.js" type="text/javascript"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/layui.css" media="all"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/layui/css/modules/layer/default/layer.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/global.css"/>
</head>
<body>
<%@include file="header.jsp" %>

    <div class="layui-container container">
          <div class="fly-none">
              <h2><i class="iconfont icon-tishilian"></i></h2>
      			<p>这是一个基于 layui 的轻个人博客模版</p>
        </div>
    </div>
    <!-- footer -->
 <%@include file="footer.jsp" %>
 </body>
</html>