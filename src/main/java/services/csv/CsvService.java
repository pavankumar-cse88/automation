package services.csv;

import com.opencsv.CSVReader;
import entities.Awards;
import entities.Movie;
import entities.Production;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvService {

    public List<Movie> readMovieCsv(String path) throws IOException {

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

    public List<Production> readProductionsCsv(String path) throws IOException {

        CSVReader csvReader = null;
        String[] productionDetails = null;

        csvReader = new CSVReader(new FileReader(path), ',', '"', 1);

        List<Production> listOfProductionObjects = new ArrayList<>();

        while ((productionDetails = csvReader.readNext()) != null) {

            Production production = new Production();
            production.setMovieName(productionDetails[0]);
            listOfProductionObjects.add(production);
        }

        return listOfProductionObjects;

    }

    public List<Awards> readAwardsCsv(String path) throws IOException {

        CSVReader csvReader = null;
        String[] awardsDetails = null;

        csvReader = new CSVReader(new FileReader(path), ',', '"', 1);

        List<Awards> listOfAwards = new ArrayList<>();

        while ((awardsDetails = csvReader.readNext()) != null) {

            Awards awards = new Awards();
            awards.setMovieName(awardsDetails[0]);
            listOfAwards.add(awards);
        }

        return listOfAwards;

    }
}
