package by.bsu.web.dao;

import by.bsu.web.entity.Hotel;

import java.math.BigDecimal;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class HotelDao {
    public  List<Hotel> findAll() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
        PreparedStatement statement = connection.prepareStatement("SELECT id, name, room_no, room_type, phone, amount FROM hotel.room;");
        ResultSet resultSet = statement.executeQuery();

        List<Hotel> rooms = new ArrayList<>();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String roomNo = resultSet.getString("room_no");
            String roomType = resultSet.getString("room_type");
            String phone = resultSet.getString("phone");
            String amount = resultSet.getString("amount");
            Hotel hotel = new Hotel(id, name,roomNo,roomType,phone,new BigDecimal(amount==null?"0":amount));
            rooms.add(hotel);
        }
        return rooms;
    }


    public void save(Hotel room) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO hotel.room (name, room_no, room_type, phone, amount) VALUES(?, ?, ?, ?, ?); ");
        statement.setString(1,room.getName());
        statement.setString(2,room.getRoomNo());
        statement.setString(3,room.getRoomType());
        statement.setString(4,room.getPhone());
        statement.setBigDecimal(5,room.getAmount());
        statement.executeUpdate();
    }

    public void delete(String id)throws SQLException, ClassNotFoundException  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
        PreparedStatement statement = connection.prepareStatement("DELETE FROM room WHERE id = ?");
        statement.setString(1,id);
        statement.executeUpdate();
    }
}
