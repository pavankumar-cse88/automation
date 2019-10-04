package services.omdb;

import entities.Production;
import services.omdb.response.OmdbMovieResponse;
import entities.Movie;

public class OmdbService {

    public Movie getMovieDetails(String title) {

        OmdbMovieResponse response = new OmdbClient().getMovieDetails(title);

        return new OmdbResponseMapper().mapMovie(response);

    }

    public Production getProductionDetails(String title) {

        OmdbMovieResponse response = new OmdbClient().getMovieDetails(title);

        return new OmdbResponseMapper().mapProduction(response);

    }

}
