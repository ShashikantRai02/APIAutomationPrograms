package com.thetestingacademy.PayLoadManagement.POJO.ManualWay.Response;
import com.thetestingacademy.PayLoadManagement.POJO.ManualWay.Response.BookingResponse;
import com.thetestingacademy.PayLoadManagement.POJO.ManualWay.request.Booking;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingResponse {

    private Integer bookingid;
    private Booking booking;

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


}
