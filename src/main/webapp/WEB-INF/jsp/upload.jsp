<%--
  Created by IntelliJ IDEA.
  User: usuario
  Date: 4/4/25
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World!</title>
</head>
<body>
<p>Gender <% out.print(request.getParameter("value")); %> added successfully!</p>
</body>
</html>
