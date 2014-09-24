<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<c:set var="ctx" value="${pageContext.request.contextPath}" />
	<link href="${ctx}/js/jquery-easyui/themes/default/easyui.css" rel="stylesheet" type="text/css">
	<link href="${ctx}/js/jquery-easyui/themes/icon.css" rel="stylesheet" type="text/css">
	<link href="${ctx}/js/jquery-easyui/default.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="${ctx}/js/jquery-easyui/jquery.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery-easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${ctx}/js/jquery-easyui/easyloader.js"></script>
	<%@ include file="/common/meta.jsp" %>
	<style type="text/css">
		html, body{
			margin: 0;
			padding: 0;
		}
	</style>
	