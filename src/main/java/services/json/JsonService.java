package services.json;

import entities.*;
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


    public Production getProductionByMovieName(String name){

        return getAllProductionDetailsFromFile()
                .stream()
                .filter(production -> production.getMovieName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }

    private List<Production> getAllProductionDetailsFromFile() {

        String fileName = "testData/ProductionData.json";

        String fileContent = getFileContentsAsString(fileName);
        ProductionList productionList = (ProductionList) JsonHelper.getObject(fileContent, ProductionList.class);
        return productionList.getProductions();

    }

    private List<Awards> getAllAwardsDetailsFromFile() {

        String fileName = "testData/AwardsData.json";

        String fileContent = getFileContentsAsString(fileName);
        AwardsList awardsList= (AwardsList) JsonHelper.getObject(fileContent, AwardsList.class);
        return awardsList.getAwards();

    }

    public Awards getAwardsByMovieName(String name){

        return getAllAwardsDetailsFromFile()
                .stream()
                .filter(awards -> awards.getMovieName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }
}
