package by.bsu.web.dao;

import by.bsu.web.entity.User;

import java.sql.*;

public class UserDao {
    public  User login(String login,String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel"
                ,"hotel","598072279");
        PreparedStatement statement = connection.prepareStatement("select id,name,is_admin from user  where login =? and password =?"  ) ;
        statement.setString(1,login);
        statement.setString(2,password);

        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()){
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            Integer adminFlag = resultSet.getInt("is_admin");
            User user=new User(id,name,adminFlag);
            return  user;
        }else{
            return null;
        }



    }


}
