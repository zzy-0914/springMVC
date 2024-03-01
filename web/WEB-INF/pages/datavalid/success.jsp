<%--
  Created by IntelliJ IDEA.
  User: 朱子洋
  Date: 2024/2/22
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> </title>
</head>
<body>
<h1>牛逼</h1>
address:<br/>
masterId=${requestScope.master.id}<br/>
主人的名字=${requestScope.master.name}<br/>
petId=${requestScope.master.pet.id}<br/>
pet的名字=${requestScope.master.pet.name}<br/>
取出 session 域的数据 <br>
主人名字= ${sessionScope.master.name }
主人信息= ${sessionScope.master }
</body>
</html>
