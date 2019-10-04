package services.omdb;

import services.omdb.response.OmdbMovieResponse;
import entities.Movie;

public class OmdbResponseMapper {

    public Movie map(OmdbMovieResponse response) {

        String movieName = response.getTitle();
        String yearOfRelease = response.getYear();
        String leadRole = response.getActors().split(",")[0];

        return new Movie(movieName, yearOfRelease, leadRole);
    }
}
