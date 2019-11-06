<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

  <script type="text/javascript" src="<%=path%>/jquery/jquery-1.8.2.js"></script>
  <link href="/resources/css/index3.css" rel="stylesheet">


<title>Insert title here</title>
</head>
<body>
<form action="list" method="post">
影片名称：<input type="text" name="name">
上映时间：<input type="date" name="startTime" value="startTime">至<input type="date" name="endTime" value="endTime"><br><br>
导演：<input type="text" name="actor">
价格：<input type="text" name="startPrice">-<input type="text" name="endPrice"><br><br>
电影年代：<input type="text" name="year">
电影时长：<input type="text" name="startLong">-<input type="text" name="endLong"><br><br>
<input type="submit" value="查询影片">
<input type="button" value="批量删除" onclick="delAll()">
<table>
<tr>
	<td>
	<input type="checkbox" onclick="qx(this.checked)">
	<input type="button" value="反选"  onclick="fx()">
	</td>
	<td>影片名</td>
	<td>导演</td>
	<td>票价</td>
	<td><a href="javascript:query('playtime')">上映时间</a></td>
	<td><a href="javascript:query('longtime')">时长</a></td>
	<td>类型</td>
	<td><a href="javascript:query('year')">年代</a></td>
	<td>区域</td>
	<td>状态</td>
	<td>操作</td>
</tr>
<c:forEach items="${page.list }" var="m">
<tr>
	<td><input type="checkbox" class="ck" value="${m.id }"></td>
	<td>${m.name }</td>
	<td>${m.actor }</td>
	<td>${m.price }</td>
	<td>${m.playtime }</td>
	<td>${m.longtime }</td>
	<td>${m.type }</td>
	<td>${m.year }</td>
	<td>${m.area }</td>
	<td>${m.status }</td>
	<td>
	<c:if test="${m.status=='已经下架' }">
	<input type="button" value="上架" onclick="update(${m.id},'正在热映')">
	</c:if>
	<c:if test="${m.status=='即将上映' }">
	<input type="button" value="下架" onclick="update(${m.id},'已经下架')">
	</c:if>
	<c:if test="${m.status=='正在热映' }">
	<input type="button" value="已经下架" onclick="update(${m.id},'即将上映')")>
	</c:if>
	</td>
</tr>
</c:forEach>
<tr>
	<td colspan="100">
	<button name="pageNum" value="1">首页</button>
	<button name="pageNum" value="${page.prePage==0?1:page.prePage }">上一页</button>
	<button name="pageNum" value="${page.nextPage==0?page.pages:page.nextPage }">下一页</button>
	<button name="pageNum" value="${page.pages }">尾页</button>
	</td>
</tr>
</table>
</form>
<script type="text/javascript">
function query(orderField){
	var orderMethod='${vo.orderMethod=='asc'?'desc':'asc'}';
	location="list?orderMethod="+orderMethod+"&orderField="+orderField;
}
function qx(flag){
	$(".ck").each(function(){
		this.checked=flag;
	})
}
function fx(){
	$(".ck").each(function(){
		this.checked=!this.checked;
	})
}
function update(id,status){
	$.post("update.do",{id:id,status:status},function(num){
		if(num=="true"){
			alert("修改成功");
			location="list";
		}else{
			alert("修改失败");
		}
	},"text")
}
function delAll(){
	var ids=[];
	$(".ck:checked").each(function(){
		ids.push(this.value);
	})

	$.post("delAll.do?ids="+ids,function(num){
		if(num=="true"){
			alert("删除成功");
			location="list";
		}else{
			alert("删除失败");
		}
	},"text")
}
</script>
</body>
</html>