<%@ page import="by.bsu.web.entity.User" %>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<%
    User user=(User)request.getSession().getAttribute("user");
    request.setAttribute("user",user);
%>
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
<div style="text-align: center; vertical-align: middle; position: relative">
    <h2 class="title">Welcome</h2>
    <a style="width: 200px" class="btn" href="controller?command=roomList">Room Info</a>
    <c:if test="${user.isAdmin==1}">
    <a style="width: 200px" class="btn" href="controller?command=addRoom">Book Room</a>
    </c:if>
    <a style="width: 200px" class="btn" href="controller?command=Logout">Logout</a><div style="text-align:center;vertical-align:middle;">
</div>
<body style="background-color: antiquewhite">

<h1 style="text-align: center;">ROOM</h1>
<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>User Name</th>
        <th>Room Number</th>
        <th>Room Type</th>
        <th>customer phone</th>
        <th>Room Price</th>
        <th>Check In Date</th>
        <th>Check Out Date</th>
        <th>Operation</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<div style="text-align:center;vertical-align:middle;">
<input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Home">
<br></br><br></br>
        <marquee scrollamount="3" direction="left"><a class="btn">If you have any questions please contact me!farawayeast@qq.com</a></marquee>
        <br></br>
        <br></br>
        <br></br>
        <marquee scrollamount="3" direction="right"><a class="btn">If you have any questions please contact me!farawayeast@qq.com</a></marquee>
</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.2.1.min.js"></script>
<script>
    function dateFormaterYMDhm(value){
        if(value){
            return new Date(value).format('yyyy-MM-ddThh:mm');
        }else{
            return value='';
        }
    }
</script>

<script>
    // 0. 要准备好一个数据


    // 1. 获取元素
    var tbody = document.querySelector('tbody')

    // 2. 准备拼接字符串
    var str = '';

    <c:forEach items="${rooms}" var="room">
    str += '<tr>';
    str += '<td>' + "${room.name}" + '</td>'
    str += '<td>' + "${room.roomNo}" + '</td>'
    str += '<td>' + "${room.roomType}" + '</td>'
    str += '<td>' + "${room.phone}" + '</td>'
    str += '<td>' + "${room.amount}" + '</td>'
    str += '<td>' + '${room.checkInDateStr}' + '</td>'
    str += '<td>' + '${room.checkOutDateStr}' + '</td>'
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
<style>
  .btn {
    display: inline-block;
    width: 1000px;
    height: 40px;
    line-height: 40px;
    margin: 0 10px;
    text-align: center;
    color: #fff;
    font-size: 25px;
    text-transform: uppercase;
    cursor: pointer;
    background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
    background-size: 400%;
    border-radius: 60px;
  }

  .btn:hover {
    animation: animate 8s linear infinite;
  }

  @keyframes animate {
    0% {
      background-position: 0%;
    }

    100% {
      background-position: 400%;
    }
  }

  .btn::before {
    content: "";
    position: absolute;
    top: -5px;
    left: -5px;
    right: -5px;
    bottom: -5px;
    z-index: -1;
    background: linear-gradient(90deg, #03a9f4, #f441a5, #ffeb3b, #03a9f4);
    background-size: 400%;
    border-radius: 40px;
    opacity: 0;
    transition: 0.5s;
  }

  .btn:hover::before {
    filter: blur(20px);
    opacity: 1;
    animation: animate 8s linear infinite;
  }
  h2 {
    border: 0;
    background: none;
    text-transform: uppercase;
    color: #eea443;
    font-weight: bold;
    position: relative;
    outline: none;
    padding: 10px 15px;
    box-sizing: border-box;
    width: 140px;
    height: 55px;
    margin: 10px auto;
  }

  h2::before,
  h2::after {
    box-sizing: inherit;
    position: absolute;
    content: "";
    border: 3px solid transparent;
    width: 0;
    height: 0;
  }

  h2::after {
    bottom: 0;
    right: 0;
  }

  h2::before {
    top: 0;
    left: 0;
  }

  h2:hover::before,
  h2:hover::after {
    width: 100%;
    height: 100%;
  }

  h2:hover::before {
    border-top-color: #d9e2a8;
    border-right-color: #d9e2a8;
    transition: width 0.3s ease-out, height 0.3s ease-out 0.3s;
  }

  h2:hover::after {
    border-bottom-color: #d9e2a8;
    border-left-color: #d9e2a8;
    transition: border-color 0s ease-out 0.6s, width 0.3s ease-out 0.6s,
      height 0.3s ease-out 1s;
  }
</style>

