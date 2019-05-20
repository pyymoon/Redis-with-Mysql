<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: WSPN
  Date: 2019/5/20
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="command" class="com.ooyy.User" scope="request"></jsp:useBean>
<html>
<head>
    <title>register</title>
</head>
<body>
<h2>register</h2>
<form:form action="/register" method="post">
    <table>
        <tr>
            <td><form:label path="userName">UserName</form:label></td>
            <td><form:input path="userName"/></td>
        </tr>
        <tr>
            <td><form:label path="password">Password</form:label></td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="address">Address</form:label></td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><form:label path="phoneNumber">PhoneNumber</form:label></td>
            <td><form:input path="phoneNumber"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="register"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
