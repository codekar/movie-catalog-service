package io.sham.moviecatalogservice.model;

public class MovieCatalog {

	Integer userId;

	String movieName;

	Integer rating;

	public MovieCatalog() {
	}

	public MovieCatalog(Integer userId, String movieName, Integer rating) {
		super();
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
