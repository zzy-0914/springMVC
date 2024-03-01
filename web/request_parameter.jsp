<%--
  Created by IntelliJ IDEA.
  User: 朱子洋
  Date: 2024/2/28
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试 request parameter</title>
</head>
<body>
<h2>获取到超链接参数值</h2>
<hr/>
<a href="vote/vote01?name=hspedu">获取超链接的参数</a>
<form action="vote/vote03" method="post">
    主人号:<input type="text" name="id"><br>
    主人名:<input type="text" name="name"><br>
    宠物号:<input type="text" name="pet.id"><br>
    宠物名:<input type="text" name="pet.name"><br>
    <input type="submit" value="添加主人和宠物">
</form>
</body>
</html>