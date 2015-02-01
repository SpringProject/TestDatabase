<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Weolcome Page</title>
</head>
<body>
	<h:form>
		<h:commandLink action="/dataPage/getData">Go to Insert Data Page</h:commandLink><br/>
		
		<h:commandLink action="/dataPage/showData">Go to Show Data Page</h:commandLink>
	</h:form>
</body>
</html>