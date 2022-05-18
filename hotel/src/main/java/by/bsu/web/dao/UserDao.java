package by.bsu.web.dao;

import java.sql.*;

public class UserDao {
    public  boolean login(String login,String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel"
                ,"root","root");
        PreparedStatement statement = connection.prepareStatement("select id,name from user  where login =? and password =?"  ) ;
        statement.setString(1,login);
        statement.setString(2,password);
        ResultSet resultSet = statement.executeQuery();
        return  resultSet.next();


    }
}
