<%--
  Created by IntelliJ IDEA.
  User: andri
  Date: 07/05/2023
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add konsumen</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <form:form action="/add" method="post" modelAttribute="konsumen">
    <form:label path="name">Nama Lengkap :</form:label>
    <form:input path="name"/><br/>

    <form:label path="alamat">Alamat:</form:label>
    <form:textarea path="alamat" cols="25" rows="5"/><br/>

    <form:label path="kota">Kota:</form:label>
    <form:input path="kota"/><br/>

    <form:label path="provinsi">Provinsi:</form:label>
    <form:input path="provinsi"/><br/>

    <form:label path="status">Gender:</form:label>
    <form:radiobutton path="status" value="aktif"/>Aktif
    <form:radiobutton path="status" value="tidak aktif"/>Tidak Aktif<br/>

    <form:button>Register</form:button>
  </form:form>
</div>
</body>
</html>
