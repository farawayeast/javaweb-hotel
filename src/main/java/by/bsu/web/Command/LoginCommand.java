package by.bsu.web.Command;

import by.bsu.web.dao.UserDao;
import by.bsu.web.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

public  class LoginCommand implements  Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        UserDao dao = new UserDao();
        User user = dao.login(login,password);

        if(user!= null){
            req.getSession().setAttribute("user",user);
            if(user.getIsAdmin()!=null &&user.getIsAdmin()==1){
                return "WEB-INF/view/admin.jsp";
            }else{
                return "WEB-INF/view/main.jsp";
            }

        }else{
            return "index.jsp";
        }

    }
}
