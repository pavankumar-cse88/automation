package services.omdb;

import services.omdb.response.OmdbMovieResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Constants;

import static io.restassured.RestAssured.given;

public class OmdbClient {

    private OmdbMovieResponse omdbMovieResponse;

    public OmdbMovieResponse getMovieDetails(String movieTitle, String yearOfRelease){

        Response response = given()
                .contentType(ContentType.JSON)
                .queryParam("t", movieTitle)
                .queryParam("y", yearOfRelease)
                .queryParam("apikey", Constants.apiKey)
                .get(Constants.omDbBaseUrl);


        omdbMovieResponse = response.as(OmdbMovieResponse.class);

        return omdbMovieResponse;
    }



}
