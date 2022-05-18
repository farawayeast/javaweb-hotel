package by.bsu.web.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public interface Command {

    String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException, UnsupportedEncodingException;
}
