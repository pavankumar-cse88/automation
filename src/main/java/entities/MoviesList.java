package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MoviesList {

    @JsonProperty("movie")
    private List<Movie> movies;

}
