package io.sham.moviecatalogservice.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.sham.moviecatalogservice.model.MovieCatalog;
import io.sham.moviecatalogservice.model.MovieInfo;
import io.sham.moviecatalogservice.model.UserMovieRatings;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	public RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<MovieCatalog> getMovieCatalog(@PathVariable Integer userId) {

		UserMovieRatings userMovieRatings = restTemplate.getForObject("http://localhost:8082/ratings/1",
				UserMovieRatings.class);

		return userMovieRatings.getRatings().stream().map(movieRating -> {
			MovieInfo movieInfo = restTemplate
					.getForObject("http://localhost:8083/movieinfo/" + movieRating.getMovieId(), MovieInfo.class);
			return new MovieCatalog(userId, movieInfo.getMovieName(), movieRating.getRating());
		}).collect(Collectors.toList());

	}

}
