<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'companyJobList.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <c:forEach items="${jList }" var="job">
    <div align="center">
    	<table>
			<tr>
				<td>职位名称：</td>
				<td><input type="text" name="jobName" value="${job.jobName }"/></td>
			</tr>
			<tr>
				<td>需求人数：</td>
				<td><input type="text" name="jobRecruitmentNumber" value="${job.jobRecruitmentNumber }"/></td>
			</tr>
			<tr>
				<td>学历要求：</td>
				<td><input type="text" name="jobEducationRequire" value="${job. jobEducationRequire}"/></td>
			</tr>
			<tr>
				<td>工作经验：</td>
				<td><input type="text" name="jobExperience" value="${job. jobExperience}"/></td>
			</tr>
			<tr>
				<td>具体描述：</td>
				<td><input type="text" name="jobDescribe" value="${job. jobDescribe}"/></td>
			</tr>
    	</table>
    </div>
    </c:forEach>
  </body>
</html>
