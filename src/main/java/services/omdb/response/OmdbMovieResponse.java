package services.omdb.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OmdbMovieResponse extends BaseResponse {

    @JsonProperty("Metascore")
    private String metaScore;

    @JsonProperty("BoxOffice")
    private String boxOffice;

    @JsonProperty("Website")
    private String webSite;

    private String imdbRating;

    private String imdbVotes;

    private List<Ratings> Ratings;

    @JsonProperty("Runtime")
    private String runTime;

    @JsonProperty("Language")
    private String language;

    @JsonProperty("Rated")
    private String rated;

    @JsonProperty("Production")
    private String production;

    @JsonProperty("Released")
    private String released;

    private String imdbID;

    @JsonProperty("Plot")
    private String plot;

    @JsonProperty("Director")
    private String director;

    @JsonProperty("Title")
    private String title;


    @JsonProperty("Actors")
    private String actors;

    @JsonProperty("Response")
    private String response;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Awards")
    private String awards;

    @JsonProperty("DVD")
    private String dvd;

    @JsonProperty("Year")
    private String year;

    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Genre")
    private String genre;

    @JsonProperty("Writer")
    private String writer;

    public String getMetascore ()
    {
        return metaScore;
    }

    public void setMetascore (String Metascore)
    {
        this.metaScore = Metascore;
    }

    public String getBoxOffice()
    {
        return boxOffice;
    }

    public void setBoxOffice(String BoxOffice)
    {
        this.boxOffice = BoxOffice;
    }

    public String getWebsite ()
    {
        return webSite;
    }

    public void setWebsite (String webSite)
    {
        this.webSite = webSite;
    }

    public String getImdbRating ()
    {
        return imdbRating;
    }

    public void setImdbRating (String imdbRating)
    {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes ()
    {
        return imdbVotes;
    }

    public void setImdbVotes (String imdbVotes)
    {
        this.imdbVotes = imdbVotes;
    }

    public List<Ratings> getRatings ()
    {
        return Ratings;
    }

    public void setRatings (List<Ratings> Ratings)
    {
        this.Ratings = Ratings;
    }

    public String getRunTime ()
    {
        return runTime;
    }

    public void setRunTime (String Runtime)
    {
        this.runTime = Runtime;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String Language)
    {
        this.language = Language;
    }

    public String getRated()
    {
        return rated;
    }

    public void setRated(String Rated)
    {
        this.rated = Rated;
    }

    public String getProduction()
    {
        return production;
    }

    public void setProduction(String Production)
    {
        this.production = Production;
    }

    public String getReleased()
    {
        return released;
    }

    public void setReleased(String Released)
    {
        this.released = Released;
    }

    public String getImdbID ()
    {
        return imdbID;
    }

    public void setImdbID (String imdbID)
    {
        this.imdbID = imdbID;
    }

    public String getPlot()
    {
        return plot;
    }

    public void setPlot(String Plot)
    {
        this.plot = Plot;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String Director)
    {
        this.director = Director;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String Title)
    {
        this.title = Title;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String Actors)
    {
        this.actors = Actors;
    }

    public String getResponse()
    {
        return response;
    }

    public void setResponse(String Response)
    {
        this.response = Response;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String Type)
    {
        this.type = Type;
    }

    public String getAwards()
    {
        return awards;
    }

    public void setAwards(String Awards)
    {
        this.awards = Awards;
    }

    public String getDvd()
    {
        return dvd;
    }

    public void setDvd(String DVD)
    {
        this.dvd = DVD;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String Year)
    {
        this.year = Year;
    }

    public String getPoster()
    {
        return poster;
    }

    public void setPoster(String Poster)
    {
        this.poster = Poster;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String Country)
    {
        this.country = Country;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String Genre)
    {
        this.genre = Genre;
    }

    public String getWriter()
    {
        return writer;
    }

    public void setWriter(String Writer)
    {
        this.writer = Writer;
    }

}
