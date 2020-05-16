package entities;

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
public class Awards {

    private String awards;
    private String movieName;

    public Awards(){

    }

    public Awards(String awards, String movieName){
        this.awards = awards;
        this.movieName = movieName;
    }

    @Override
    public boolean equals(Object o) {

        Awards awardsForMovie = (Awards) o;
        return Objects.equals(awards, awardsForMovie.awards);
    }

    @Override
    public String toString() {
        return "Awards{" +
                "awards='" + awards + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
