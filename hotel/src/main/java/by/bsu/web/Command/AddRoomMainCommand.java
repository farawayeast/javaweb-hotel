package by.bsu.web.Command;

import by.bsu.web.entity.Hotel;
import by.bsu.web.dao.HotelDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.SQLException;

public class AddRoomMainCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
        HotelDao dao =new HotelDao();
        String name = new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        String roomNo = new String(req.getParameter("roomNo").getBytes("iso-8859-1"), "utf-8");
        String roomType = new String(req.getParameter("roomType").getBytes("iso-8859-1"), "utf-8");
        String phone = new String(req.getParameter("phone").getBytes("iso-8859-1"), "utf-8");
        String amount = new String(req.getParameter("amount").getBytes("iso-8859-1"), "utf-8");
        Hotel hotel =new Hotel();
        hotel.setName(name);
        hotel.setAmount(new BigDecimal(amount+""));
        hotel.setRoomNo(roomNo);
        hotel.setPhone(phone);
        hotel.setRoomType(roomType);
        dao.save(hotel);
        return "WEB-INF/view/main.jsp";
    }
}
