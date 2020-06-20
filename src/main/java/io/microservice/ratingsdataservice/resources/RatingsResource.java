package io.microservice.ratingsdataservice.resources;

import io.microservice.ratingsdataservice.models.Rating;
import io.microservice.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsResource {
    @RequestMapping("/{movieId}")
    public Rating getRatingByMovieId(@PathVariable("movieId") String movieId)
    {
        return new Rating("01",4.5);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getRatingsByUser(@PathVariable("userId") String userId)
    {
        List<Rating> ratings= Arrays.asList(
                new Rating("550",4.5),
                new Rating("551",4.8)
        );

        return new UserRating(ratings);
    }
}
