package entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter

public class Movie {

    private String movieName;
    private String yearOfRelease;
    private String leadRole;

    public Movie() {
    }

    public Movie(String movieName, String yearOfRelease, String leadRole) {

        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.leadRole = leadRole;
    }

    @Override
    public boolean equals(Object o) {

        Movie movie = (Movie) o;
        return Objects.equals(leadRole, movie.leadRole);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", leadRole='" + leadRole + '\'' +
                '}';
    }
}
