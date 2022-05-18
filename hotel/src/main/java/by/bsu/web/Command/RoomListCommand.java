package by.bsu.web.Command;

import by.bsu.web.entity.Hotel;
import by.bsu.web.dao.HotelDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;

public class RoomListCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException {
        HotelDao dao = new HotelDao();
        List<Hotel> rooms =dao.findAll();
        req.setAttribute("rooms",rooms);
        return "WEB-INF/view/room-list.jsp";
    }
}
