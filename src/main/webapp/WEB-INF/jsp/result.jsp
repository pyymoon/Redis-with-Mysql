<%--
  Created by IntelliJ IDEA.
  User: WSPN
  Date: 2019/5/13
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>spring table</title>
</head>
<body>
<h2>student information</h2>
<table>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>Id</td>
        <td>${id}</td>
    </tr>
</table>
</body>
</html>