package by.bsu.web.Command;

import by.bsu.web.dao.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public  class LoginCommand implements  Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        UserDao dao = new UserDao();
        boolean success = dao.login(login,password);

        if(success){
            return "WEB-INF/view/main.jsp";
        }else{
            return "index.jsp";
        }

    }
}
