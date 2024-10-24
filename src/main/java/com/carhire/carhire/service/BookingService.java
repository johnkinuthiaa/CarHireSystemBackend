package com.carhire.carhire.service;

import com.carhire.carhire.models.Booking;
import com.carhire.carhire.models.CarVariant;

import java.util.List;

public interface BookingService {
    Booking createNewBooking(Booking carDetails,Long id);
    List<Booking> getAllBookings();
    void cancelBooking(Long id);
}
