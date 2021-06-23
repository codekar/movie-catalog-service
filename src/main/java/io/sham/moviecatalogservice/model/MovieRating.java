package io.sham.moviecatalogservice.model;

public class MovieRating {

	private Integer userId;

	private Integer movieId;

	private Integer rating;

	public MovieRating() {

	}

	public MovieRating(Integer userId, Integer movieId, Integer rating) {
		super();
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
