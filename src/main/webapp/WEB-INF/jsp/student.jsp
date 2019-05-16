<%--
  Created by IntelliJ IDEA.
  User: WSPN
  Date: 2019/5/13
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:useBean id="command" class="com.ooyy.Student" scope="request"></jsp:useBean>
<html>
<head>
    <title>jdbc</title>
</head>
<body>
<h2>jdbc</h2>
<form:form  method="POST" action="/addStudent">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
            <%--<tr>--%>
            <%--<td><form:label path="id">Id</form:label></td>--%>
            <%--<td><form:input path="id"/></td>--%>
            <%--</tr>--%>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>

<form:form action="/look" method="GET">
    <table>
        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Find"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>