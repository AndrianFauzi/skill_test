<%--
  Created by IntelliJ IDEA.
  User: andri
  Date: 06/05/2023
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css"></script>
    <script src="https://cdn.datatables.net/1.13.4/css/dataTables.bootstrap5.min.css"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap5.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#example').DataTable();
        });
    </script>
</head>
<body>
<div class="container mt-3">
    <a href="/add" type="button" class="btn btn-primary">Tambah Konsumen</a>
    <table id="example" class="table table-striped" style="width:100%">
    <thead>
    <tr>
        <th>Nama</th>
        <th>Alamat</th>
        <th>Kota</th>
        <th>Provinsi</th>
        <th>Tanggal Registrasi</th>
        <th>Status</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${konsumen}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.alamat}</td>
            <td>${book.kota}</td>
            <td>${book.provinsi}</td>
            <td>${book.tgl_registrasi}</td>
            <td>${book.status}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>


</body>
</html>
