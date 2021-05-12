<%--<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/13
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>书本新增</h1>
<f:form action="${ctx}/book/bookadd" method="post" modelAttribute="book">
   书本名字： <f:input path="bookName"/>
   价格： <f:input path="price"/>
   <input type="submit" value="提交">
</f:form>

</body>
</html>
