<%--
  Created by IntelliJ IDEA.
  User: qyh
  Date: 2018/10/16
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" isELIgnored="false"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<json:object escapeXml="false">
    <json:property name="code" value="${code}"> </json:property>
    <%--键值对，知道key值后，在jsp中获取value值--%>
    <json:property name="message">
        <spring:message code="${code}"/>
    </json:property>
    <%-- <json:property name="message" value="${message}"></json:property>--%>
    <json:array name="data" items="${first}" var="first">
        <json:object>
            <json:property name="id" value="${first.id}"/>
            <json:property name="name" value="${first.name}"/>
        </json:object>
    </json:array>
</json:object>