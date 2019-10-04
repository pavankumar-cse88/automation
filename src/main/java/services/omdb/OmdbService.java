package services.omdb;

import services.omdb.response.OmdbMovieResponse;
import entities.Movie;

public class OmdbService {

    public Movie getMovieDetails(String title) {

        OmdbMovieResponse response = new OmdbClient().getMovieDetails(title);

        return new OmdbResponseMapper().map(response);

    }

}
