<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2022-05-17
  Time: 오전 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h2>form-ex.jsp</h2>
<!-- action : 데이터를 보낼 목적지 주소
     method : http request 방식 생략가능(생략시 기본값은 get) -->
    <form action="param-req1" method="get">
        <input type="text" name="param1" placeholder="param1"><br>
        <input type="text" name="param2" placeholder="param2"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>
