<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Addjob.jsp' starting page</title>
    
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
   <!--  private Integer jobId;
	private Office office;
	private Company company;
	private Integer jobRecruitmentNumber;
	private String jobName;
	private String jobEducationRequire;
	private String jobExperience;
	private String jobDescribe; -->
	<form action="job_doAdd.action" method="post">
		<table>
			<tr>
				<td>职位名称：</td>
				<td><input type="text" name="jobName"/></td>
			</tr>
			<tr>
				<td>需求人数：</td>
				<td><input type="text" name="jobRecruitmentNumber"/></td>
			</tr>
			<tr>
				<td>学历要求：</td>
				<td><input type="text" name="jobEducationRequire"/></td>
			</tr>
			<tr>
				<td>工作经验：</td>
				<td><input type="text" name="jobExperience"/></td>
			</tr>
			<tr>
				<td>具体描述：</td>
				<td><input type="text" name="jobDescribe"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"/></td>
			</tr>
			<tr>
				<td></td>
				<!-- <td><input type="submit" value="提交"/></td> -->
			</tr>
		</table>
	</form>
  </body>
</html>
