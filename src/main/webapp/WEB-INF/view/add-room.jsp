<%@ page import="by.bsu.web.entity.User" %>
<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    User user=(User)request.getSession().getAttribute("user");
    request.setAttribute("user",user);
%>
<html>
<div style="text-align: center; vertical-align: middle; position: relative">
    <h2 class="title">Welcome</h2>
    <a style="width: 200px" class="btn" href="controller?command=roomList">Room Info</a>
    <c:if test="${user.isAdmin==1}">
        <a style="width: 200px" class="btn" href="controller?command=addRoom">Book Room</a>
    </c:if>
    <a style="width: 200px" class="btn" href="controller?command=Logout">Logout</a><div style="text-align:center;vertical-align:middle;">
</div>
<body style="background-color: antiquewhite">
        <h1>BOOK</h1>
        <br></br>
        <form action="controller?command=addRoomMain" method="post">
            <span>User   Name:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter User name" name="name" style="margin-left: 10px"/><br>
            <span>Room  Number:</span> <input type="text"  placeholder="Please enter room number" name="roomNo" style="margin-left: 25px"/><br>
<%--            <span>Room   Type:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter room type" name="roomType" style="margin-left: 15px"/><br>--%>
            <span style="margin-rigth: 50px">Room  Typer:&nbsp;&nbsp;
                <select name="roomType" style="width:180px;margin-left: 28px">
                <option value="Single Room">Single Room</option>
                <option value="Double Room">Double Room</option>
                <option value="Sea View Room">Sea View Room</option>
                <option value="Vip Room">Vip Room</option>
            </select><br>
            <span  style="margin-left: 1px">Phone Number:</span>&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter phone number" name="phone" style="margin-left: 1px"/><br>
            <span  style="margin-left: 1px">Room  Price:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"   placeholder="Please enter the room price" name="amount" style="margin-left: 16px"/><br>
            <span style="margin-left: 1px">Check In  Date:</span>&nbsp;&nbsp;&nbsp;&nbsp; <input type="datetime-local"   placeholder="Please enter the room checkIn date" name="checkInDate" style="margin-left: 16px"/><br>
            <span style="margin-left: 1px">Check In  Date:</span>&nbsp;&nbsp;&nbsp;&nbsp; <input type="datetime-local"   placeholder="Please enter the room checkOut date" name="checkOutDate" style="margin-left: 16px"/><br>
            <br/>
            <input type="submit" name="" value="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Home">
            <br></br>
            <br></br>


        </form>
        <marquee scrollamount="3" direction="left"><a class="btn">If you have any questions please contact me!farawayeast@qq.com</a></marquee>
        <br></br>
        <br></br>
        <br></br>



        <marquee scrollamount="3" direction="right"><a class="btn">If you have any questions please contact me!farawayeast@qq.com</a></marquee>

    </div>
    </body>
</html>
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
