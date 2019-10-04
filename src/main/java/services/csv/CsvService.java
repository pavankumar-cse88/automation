package services.csv;

import com.opencsv.CSVReader;
import entities.Movie;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvService {

    public List<Movie> readFromCsv(String path) throws IOException {

        CSVReader csvReader = null;
        String[] movieDetails = null;

        csvReader = new CSVReader(new FileReader(path), ',', '"', 1);

        List<Movie> listOfMovieObjects = new ArrayList<>();

        while ((movieDetails = csvReader.readNext()) != null) {

            Movie movie = new Movie();
            movie.setMovieName(movieDetails[0]);
            listOfMovieObjects.add(movie);
        }

        return listOfMovieObjects;

    }
}
