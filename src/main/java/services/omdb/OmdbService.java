package services.omdb;

import services.omdb.response.OmdbMovieResponse;
import entities.Movie;

public class OmdbService {

    public Movie getMovieDetails(String title, String yearOfRelease) {

        OmdbMovieResponse response = new OmdbClient().getMovieDetails(title, yearOfRelease);

        return new OmdbResponseMapper().map(response);

    }

}
