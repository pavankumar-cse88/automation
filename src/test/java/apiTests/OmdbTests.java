package apiTests;

import entities.Movie;
import com.relevantcodes.extentreports.LogStatus;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import services.csv.CsvService;
import services.json.JsonService;
import services.omdb.OmdbService;
import utils.TestBase;

import java.io.IOException;
import java.util.List;

import static utils.Constants.jamesCameronFilMoGraPhyPath;

public class OmdbTests extends TestBase {


    @Test(dataProvider = "movieComparisionTestCases")
    public void compareMovieDetailsWithOmDb(Movie movie) throws ParseException {

        extentTest = extentReport.startTest("Comparision of Movie Details for Movie : " + movie.getMovieName());

        Movie movieFromJson = new JsonService().getMovieByName(movie.getMovieName());
        Movie movieFromOmdb = new OmdbService().getMovieDetails(movie.getMovieName());

        extentTest.log(LogStatus.INFO, "Movie Details from Json :" + movieFromJson.toString());
        extentTest.log(LogStatus.INFO, "Movie Details from OMDB :" + movieFromOmdb.toString());

        Assert.assertTrue(movieFromJson.equals(movieFromOmdb));

    }

    @DataProvider(name = "movieComparisionTestCases")
    public Object[] movieComparisionTestCases() throws IOException {

        CsvService csvService = new CsvService();
        List<Movie> listOfMovieObjects = csvService.readFromCsv(jamesCameronFilMoGraPhyPath);
        return listOfMovieObjects.toArray();

    }

}




