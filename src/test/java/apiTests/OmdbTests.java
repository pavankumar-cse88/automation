package apiTests;

import com.relevantcodes.extentreports.LogStatus;
import entities.Awards;
import entities.Movie;
import entities.Production;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import services.csv.CsvService;
import services.json.JsonService;
import services.omdb.OmdbService;
import utils.TestBase;

import java.io.IOException;
import java.util.List;

import static utils.Constants.*;

public class OmdbTests extends TestBase {


    @Test(dataProvider = "movieComparisionTestCases")
    public void compareMovieDetailsWithOmDb(Movie movie) {

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
        List<Movie> listOfMovieObjects = csvService.readMovieCsv(jamesCameronFilMoGraPhyPath);
        return listOfMovieObjects.toArray();

    }

    @Test(dataProvider = "productionTestCases")
    public void compareProductionDetailsWithOmDb(Production production){

        extentTest = extentReport.startTest("Comparision of Production Details for Movie : " + production.getMovieName());

        Production productionFromJson = new JsonService().getProductionByMovieName(production.getMovieName());
        Production productionFromOmdb = new OmdbService().getProductionDetails(production.getMovieName());

        extentTest.log(LogStatus.INFO, "Production Details from Json :" + productionFromJson.toString());
        extentTest.log(LogStatus.INFO, "Production Details from OMDB :" + productionFromOmdb.toString());

        Assert.assertTrue(productionFromJson.equals(productionFromOmdb));


    }

    @DataProvider(name = "productionTestCases")
    public Object[] productionTestCases() throws IOException {

        CsvService csvService = new CsvService();
        List<Production> listOfProductionObjects = csvService.readProductionsCsv(jamesCameronProductionPath);
        return listOfProductionObjects.toArray();

    }

    @Test(dataProvider = "awardTestCases")
    public void compareAwardsDetailsWithOmDb(Awards awards){

        extentTest = extentReport.startTest("Comparision of Award Details for Movie : " + awards.getMovieName());

        Awards awardsFromJson = new JsonService().getAwardsByMovieName(awards.getMovieName());
        Awards awardsFromOmdb = new OmdbService().getAwardsDetails(awards.getMovieName());

        extentTest.log(LogStatus.INFO, "Awards Details from Json :" + awardsFromJson.toString());
        extentTest.log(LogStatus.INFO, "Awards Details from OMDB :" + awardsFromOmdb.toString());

        Assert.assertTrue(awardsFromJson.equals(awardsFromOmdb));


    }

    @DataProvider(name = "awardTestCases")
    public Object[] awardTestCases() throws IOException {

        CsvService csvService = new CsvService();
        List<Awards> listOfAwardsObjects = csvService.readAwardsCsv(jamesCameronAwardsPath);
        return listOfAwardsObjects.toArray();

    }



}




