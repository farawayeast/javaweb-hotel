package by.bsu.web.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hotel {
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private Integer id;
    private String name;
    private String roomNo;
    private String roomType;
    private String phone;
    private BigDecimal amount;
    private LocalDateTime checkInDate;
    private LocalDateTime  checkOutDate;

    private String checkInDateStr;
    private String checkOutDateStr;

    public String getCheckInDateStr() {
        return checkInDateStr;
    }

    public void setCheckInDateStr(String checkInDateStr) {
        this.checkInDateStr = checkInDateStr;
    }

    public String getCheckOutDateStr() {
        return checkOutDateStr;
    }

    public void setCheckOutDateStr(String checkOutDateStr) {
        this.checkOutDateStr = checkOutDateStr;
    }

    public Hotel() {
    }

    public Hotel(Integer id, String name, String roomNo, String roomType, String phone, BigDecimal amount, LocalDateTime checkInDate, LocalDateTime checkOutDate) {
        this.id = id;
        this.name = name;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.phone = phone;
        this.amount = amount;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        if(checkInDate!=null){
            this.checkInDateStr=checkInDate.format(sdf);
        }
        if(checkOutDate!=null){
            this.checkOutDateStr=checkOutDate.format(sdf);
        }
    }

    public LocalDateTime getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDateTime checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDateTime getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
