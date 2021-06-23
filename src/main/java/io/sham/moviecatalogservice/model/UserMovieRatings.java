package io.sham.moviecatalogservice.model;

import java.util.List;

public class UserMovieRatings {

	private Integer userId;

	private List<MovieRating> ratings;

	public UserMovieRatings() {
	}

	public UserMovieRatings(Integer userId, List<MovieRating> ratings) {
		super();
		this.userId = userId;
		this.ratings = ratings;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<MovieRating> getRatings() {
		return ratings;
	}

	public void setRatings(List<MovieRating> ratings) {
		this.ratings = ratings;
	}

}
