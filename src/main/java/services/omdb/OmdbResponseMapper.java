package services.omdb;

import entities.Awards;
import entities.Production;
import services.omdb.response.OmdbMovieResponse;
import entities.Movie;

public class OmdbResponseMapper {

    public Movie mapMovie(OmdbMovieResponse response) {

        String movieName = response.getTitle();
        String yearOfRelease = response.getYear();
        String leadRole = response.getActors().split(",")[0];

        return new Movie(movieName, yearOfRelease, leadRole);
    }

    public Production mapProduction(OmdbMovieResponse response) {

        String movieName = response.getTitle();
        String production = response.getProduction();

        return new Production(movieName,production);
    }

    public Awards mapAwards(OmdbMovieResponse response) {

        String movieName = response.getTitle();
        String awards = response.getAwards();

        return new Awards(awards,movieName);
    }
}
