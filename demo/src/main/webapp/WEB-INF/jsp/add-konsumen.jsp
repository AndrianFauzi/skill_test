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
<div class="container mt-3">
  <c:if test="${addKonsumenSuccess}">
    <div class="text-success">Successfully added Konsumen</div>
  </c:if>
  <form:form action="/add" method="post" modelAttribute="konsumen">
    <div class="mb-3">
    <form:label path="name" class="form-label">Nama Lengkap :</form:label>
    <form:input path="name" class="form-control"/>
    </div>

    <form:label path="alamat" class="form-label">Alamat:</form:label>
    <form:textarea path="alamat" cols="25" rows="5" class="form-control"/><br/>

    <form:label path="kota" class="form-label">Kota:</form:label>
    <form:input path="kota" class="form-control"/><br/>

    <form:label path="provinsi" class="form-label">Provinsi:</form:label>
    <form:input path="provinsi" class="form-control"/><br/>

    <form:label path="status" class="form-label">Status:</form:label>
    <form:radiobutton path="status" value="aktif"/>Aktif
    <form:radiobutton path="status" value="tidak aktif"/>Tidak Aktif<br/>

    <form:button class="btn btn-primary form-control">Register</form:button>
  </form:form>
  <a href="/konsumen" type="button" class="btn btn-danger form-control">Lihat Daftar Konsumen</a>
</div>
</body>
</html>
