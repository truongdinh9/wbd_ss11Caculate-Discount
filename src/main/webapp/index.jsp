<%--
  Created by IntelliJ IDEA.
  User: dinh
  Date: 15/04/2019
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/CalculateDiscount">
List Price:
<br/>
<input type="text" name="price" placeholder=" input price">
<br/>
Discount Percent: <br/>
<input type="text" name="discount" placeholder="input discount"><br/>
Product Description: <br/>
<textarea placeholder="input Description"></textarea><br/>
    <input type="submit" value="CaculateDiscount">
</form>
</body>
</html>
