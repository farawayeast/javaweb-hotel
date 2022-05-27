package by.bsu.web.Command;

import by.bsu.web.dao.HotelDao;
import by.bsu.web.entity.Hotel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class DeleteRoomMainCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, SQLException, ClassNotFoundException {
        HotelDao dao =new HotelDao();
        String id = new String(req.getParameter("id").getBytes("iso-8859-1"), "utf-8");
        dao.delete(id);
        return "WEB-INF/view/room-list.jsp";
    }
}
