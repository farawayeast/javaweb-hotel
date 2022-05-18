<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<style>

    * {
        margin: 0;
        padding: 0;
    }

    table {
        width: 500px;
        text-align: center;
        margin: 50px auto;
    }

</style>
<body style="background-color: antiquewhite">

<h2 style="text-align: center;">Room List</h2>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>id</th>
        <th>Room Name</th>
        <th>Room Number</th>
        <th>Room Type</th>
        <th>customer phone</th>
        <th>Room Price</th>
        <th>Operation</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<div style="text-align:center;vertical-align:middle;">
<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Home">
</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.1.min.js"></script>

<script>
    // 0. 要准备好一个数据


    // 1. 获取元素
    var tbody = document.querySelector('tbody')

    // 2. 准备拼接字符串
    var str = '';

    <c:forEach items="${rooms}" var="room">
    str += '<tr>';
    str += '<td>' + "${room.id}" + '</td>'
    str += '<td>' + "${room.name}" + '</td>'
    str += '<td>' + "${room.roomNo}" + '</td>'
    str += '<td>' + "${room.roomType}" + '</td>'
    str += '<td>' + "${room.phone}" + '</td>'
    str += '<td>' + "${room.amount}" + '</td>'
    str +='<td><button type="submit" onclick="deleteRoom(${ room.id })">Delete</button> </td>'
    </c:forEach>
    str += '</tr>';
    // 将定义好的内容,写入到taody标签中
    tbody.innerHTML = str;
    function deleteRoom(id){
        $.ajax({
            url: 'controller?command=deleteRoom&id='+id,
            type: 'POST',
            data: id,
            success:function (result) {
                window.location.reload();
            }
        });
    }
</script>
