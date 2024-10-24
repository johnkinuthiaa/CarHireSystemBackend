package com.carhire.carhire.controller;

import com.carhire.carhire.models.Booking;
import com.carhire.carhire.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer/bookings")
public class BookingController {
    private final BookingService service;

    public BookingController(BookingService service){
        this.service=service;
    }
    @GetMapping("/all/bookings")
    public ResponseEntity<List<Booking>> getAllBookings(){
        return ResponseEntity.ok(service.getAllBookings());
    }
    @PostMapping("/create/booking")
    public ResponseEntity<Booking>createNewBooking(@RequestBody Booking carDetails,@RequestParam Long id){
        return ResponseEntity.ok(service.createNewBooking(carDetails,id));
    }
    @DeleteMapping("/cancel/booking")
    public void cancelBooking(@RequestParam Long id){
        service.cancelBooking(id);
    }

}
