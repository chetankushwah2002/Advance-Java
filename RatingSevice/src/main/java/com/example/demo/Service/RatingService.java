package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Rating;

public interface RatingService {
	Rating create (Rating rating);
	List<Rating> getRating();
	List<Rating> getRatingByUserId(String UserId);
	List<Rating> getRatingByHotelId(String hotelId);
}
