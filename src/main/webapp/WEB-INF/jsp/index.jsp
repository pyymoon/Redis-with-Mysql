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
    <title>index</title>
</head>
<body>
<h2>welcome</h2>
<form:form method="post" action="/yanIndex">
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
            <td rowspan="2">
                <input type="submit" value="login"/>
            </td>
            <td>


                    <%--<a href="register">register</a>--%>
            </td>
        </tr>
    </table>
</form:form>
<form:form method="get" action="/goRegister">
    <table>
        <tr>
            <td rowspan="2">
                <input type="submit" value="register">
            </td>
        </tr>
    </table>

</form:form>
</body>
</html>
