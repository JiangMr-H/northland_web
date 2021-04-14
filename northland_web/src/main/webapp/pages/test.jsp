<%--
  Created by IntelliJ IDEA.
  User: jiangzh
  Date: 2021/4/14
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="../style/select/dist/css/bootstrap-select.min.css" rel="stylesheet" />
<link
      href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
<script
        src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>
<script
        src="${pageContext.request.contextPath}/style/select/dist/css/bootstrap-select.css"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/style/select/js/bootstrap-select.js"></script>
<body>

<select class="selectpicker" multiple data-live-search="true" data-selected-text-format="count > 3"
        style="position: absolute;z-index: 1;" onmousedown="if(this.options.length>6){this.size=7}" onblur="this.size=0" onchange="this.size=0">
    <option></option>
    <option>LOWA</option>
    <option>ALPINA</option>
    <option>KJUS</option>
    <option>ZANIER</option>
    <option>NORTHLAND</option>
    <option>LIDAKIS</option>
    <option>ACTIONFOX</option>
    <option>POC</option>
    <option>HALTI</option>
    <option>特卖</option>
    <option>LEKI滑雪</option>
    <option>TRECKO</option>
    <option>VAUHTI</option>
    <option>VIAGPRO</option>
    <option>LEVEL</option>
    <option>NATURE URBAN</option>
    <option>OTHER</option>
    <option>LEKI徒步</option>
    <option>HEAD</option>
    <option>NORTHLAND.KIDS</option>
</select>

<select class="selectpicker" multiple style="position: absolute;z-index: 1;" onmousedown="if(this.options.length>6){this.size=7}" onblur="this.size=0" onchange="this.size=0">
    <option value="volvo">文学集</option>
    <option value="saab">哲学</option>
    <option value="opel">雅思</option>
    <option value="audi">大学网奥数大学网奥数</option>
    <option value="volvo">文学集</option>
    <option value="saab">哲学</option>
    <option value="opel">雅思</option>
    <option value="audi">大学网奥数</option>
</select>

</body>
</html>
