package org.RestAPi.ex_07_PayLoadManagement.Class.Classes.Response_PayLoad;

import org.RestAPi.ex_07_PayLoadManagement.Class.Classes.Request_PayLoad.Booking;

public class BookingResponse {
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

    private Integer bookingid;
    private Booking booking;
}
