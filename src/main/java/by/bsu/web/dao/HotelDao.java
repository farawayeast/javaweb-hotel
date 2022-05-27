package by.bsu.web.dao;

import by.bsu.web.entity.Hotel;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class HotelDao {
    public  List<Hotel> findAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "hotel", "598072279");
        PreparedStatement statement = connection.prepareStatement("SELECT id, name, room_no, room_type, phone, amount,check_in_date,check_out_date FROM hotel.room;");
        ResultSet resultSet = statement.executeQuery();

        List<Hotel> rooms = new ArrayList<>();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String roomNo = resultSet.getString("room_no");
            String roomType = resultSet.getString("room_type");
            String phone = resultSet.getString("phone");
            String amount = resultSet.getString("amount");
            Timestamp checkInDate = resultSet.getTimestamp("check_in_date");
            Timestamp checkOutDate = resultSet.getTimestamp("check_out_date");
            Hotel hotel = new Hotel(id, name,roomNo,roomType,phone,new BigDecimal(amount==null?"0":amount),checkInDate !=null?checkInDate.toLocalDateTime():null,checkOutDate!=null?checkOutDate.toLocalDateTime():null);
            rooms.add(hotel);
        }
        return rooms;
    }


    public void save(Hotel room) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "hotel", "598072279");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO hotel.room (name, room_no, room_type, phone, amount,check_in_date,check_out_date) VALUES(?, ?, ?, ?, ?,?,?); ");
        statement.setString(1,room.getName());
        statement.setString(2,room.getRoomNo());
        statement.setString(3,room.getRoomType());
        statement.setString(4,room.getPhone());
        statement.setBigDecimal(5,room.getAmount());
        statement.setTimestamp(6,Timestamp.valueOf(room.getCheckInDate()));
        statement.setTimestamp(7,Timestamp.valueOf(room.getCheckOutDate()));
        statement.executeUpdate();
    }

    public void delete(String id)throws SQLException, ClassNotFoundException  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "hotel", "598072279");
        PreparedStatement statement = connection.prepareStatement("DELETE FROM room WHERE id = ?");
        statement.setString(1,id);
        statement.executeUpdate();
    }
}
