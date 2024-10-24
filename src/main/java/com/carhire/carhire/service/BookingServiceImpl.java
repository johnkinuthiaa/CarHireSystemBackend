package com.carhire.carhire.service;

import com.carhire.carhire.models.Booking;
import com.carhire.carhire.models.CarVariant;
import com.carhire.carhire.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

//private Long id;
//private String variantImg;
//private String name;
//private String bookingId;
//private Integer totalDays;
//private BigDecimal price;
//private String Customer;
//private LocalDateTime bookingTime;
//private LocalDateTime bookFrom;
//private LocalDateTime bookTo;
//private String status;
//private String vehicleReg;
//private String paymentStatus;
@Service
public class BookingServiceImpl implements BookingService{
    private final BookingRepository repository;

    public BookingServiceImpl(BookingRepository repository){
        this.repository=repository;
    }

    @Override
    public Booking createNewBooking(Booking carDetails,Long id) {
        Booking booking =new Booking();
        if(repository.findById(id).isEmpty()){
            throw new RuntimeException("booking already exists");
        }else{
            booking.setVariantImg(carDetails.getVariantImg());
            booking.setName(carDetails.getName());
            booking.setBookingId(getBookingId());
            booking.setTotalDays(carDetails.getTotalDays());
            booking.setPrice(carDetails.getPrice());
            booking.setCustomer(carDetails.getCustomer());
            booking.setBookingTime(LocalDateTime.now());
            booking.setBookFrom(carDetails.getBookFrom());
            booking.setBookTo(carDetails.getBookTo());
            booking.setStatus(carDetails.getStatus());
            booking.setVehicleReg(carDetails.getVehicleReg());
            booking.setPaymentStatus(carDetails.getPaymentStatus());
        }

        return null;
    }

    private String getBookingId() {
        UUID bookingId =UUID.randomUUID();
        return bookingId.toString();

    }

    @Override
    public List<Booking> getAllBookings() {
        return repository.findAll();
    }
    @Override
    public void cancelBooking(Long id){
        if(repository.findById(id).isPresent()){
            repository.delete(repository.findById(id).orElseThrow());
        }
    }
}
