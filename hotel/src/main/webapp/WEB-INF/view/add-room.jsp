<%@ page contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body style="background-color: antiquewhite">
<div style="text-align:center;vertical-align:middle;">
        <h2>Add Room</h2>
        <form action="controller?command=addRoomMain" method="post">
            <span>Room  Name:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter room name" name="name" style="margin-left: 10px"/><br>
            <span>Room  Number:</span>&nbsp;<input type="text"  placeholder="Please enter room number" name="roomNo" style="margin-left: 25px"/><br>
            <span>Room  Type:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter room type" name="roomType" style="margin-left: 15px"/><br>
            <span>Phone Number:</span>&nbsp;&nbsp;&nbsp; <input type="text"  placeholder="Please enter phone number" name="phone" style="margin-left: 1px"/><br>
            <span>Room  Price:</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text"   placeholder="Please enter the room price" name="amount" style="margin-left: 16px"/><br>
            <br/>
            <input type="submit" name="" value="submit">
            <input type="button" name="Submit" onclick="javascript:history.back(-1);" value="Home">
        </form>
    </div>
    </body>
</html>
