package by.bsu.web.Command;

import by.bsu.web.entity.Hotel;
import by.bsu.web.dao.HotelDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AddRoomMainCommand implements Command{
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
        HotelDao dao =new HotelDao();
        String name = new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        String roomNo = new String(req.getParameter("roomNo").getBytes("iso-8859-1"), "utf-8");
        String roomType = new String(req.getParameter("roomType").getBytes("iso-8859-1"), "utf-8");
        String phone = new String(req.getParameter("phone").getBytes("iso-8859-1"), "utf-8");
        String amount = new String(req.getParameter("amount").getBytes("iso-8859-1"), "utf-8");
        String checkInDateStr = new String(req.getParameter("checkInDate").getBytes("iso-8859-1"), "utf-8");
        String checkOutDateStr = new String(req.getParameter("checkOutDate").getBytes("iso-8859-1"), "utf-8");
        Hotel hotel =new Hotel();
        hotel.setName(name);
        hotel.setAmount(new BigDecimal(amount+""));
        hotel.setRoomNo(roomNo);
        hotel.setPhone(phone);
        hotel.setRoomType(roomType);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime checkInDate = LocalDateTime.parse(checkInDateStr.replaceAll("T", " ") + ":00", sdf);
        LocalDateTime checkOutDate = LocalDateTime.parse(checkOutDateStr.replaceAll("T", " ") + ":00", sdf);
        hotel.setCheckInDate(checkInDate);
        hotel.setCheckOutDate(checkOutDate);
        dao.save(hotel);
        return "WEB-INF/view/admin.jsp";
    }
}
