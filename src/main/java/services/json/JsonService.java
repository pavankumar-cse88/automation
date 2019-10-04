package services.json;

import entities.Movie;
import entities.MoviesList;
import utils.JsonHelper;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

public class JsonService {


    public Movie getMovieByName(String name) {
        return getAllMoviesFromFile()
                .stream()
                .filter(movie -> movie.getMovieName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }

    private List<Movie> getAllMoviesFromFile() {

        String fileName = "testData/MovieData.json";

        String fileContent = getFileContentsAsString(fileName);
        MoviesList moviesList = (MoviesList) JsonHelper.getObject(fileContent, MoviesList.class);
        return moviesList.getMovies();

    }

    private String getFileContentsAsString(String fileName) {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
        return JsonHelper.getFileContentsAsString(inputStream);
    }

}
