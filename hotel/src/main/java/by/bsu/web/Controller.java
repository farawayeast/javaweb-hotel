package by.bsu.web;

import by.bsu.web.Command.Command;
import by.bsu.web.Command.CommandFactory;
import by.bsu.web.Command.LoginCommand;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Controller extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest reg, HttpServletResponse resp)
            throws IOException,ServletException {
        process(reg,resp);
    }

    @Override
    public void doPost(HttpServletRequest reg, HttpServletResponse resp)
            throws IOException,ServletException {
        process(reg,resp);
    }


    public void process(HttpServletRequest reg, HttpServletResponse resp) throws IOException,ServletException {

        try {
            CommandFactory factor =new CommandFactory();
            String commandParam =reg.getParameter("command");
            Command command =factor.create(commandParam);
            String page = command.execute(reg, resp);
            reg.getRequestDispatcher(page).forward(reg, resp);
        } catch (SQLException | ServletException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
