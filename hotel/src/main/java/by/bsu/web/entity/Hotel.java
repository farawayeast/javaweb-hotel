package by.bsu.web.entity;

import java.math.BigDecimal;

public class Hotel {
    private Integer id;
    private String name;
    private String roomNo;
    private String roomType;
    private String phone;
    private BigDecimal amount;

    public Hotel() {
    }

    public Hotel(Integer id, String name, String roomNo, String roomType, String phone, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.phone = phone;
        this.amount = amount;
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
