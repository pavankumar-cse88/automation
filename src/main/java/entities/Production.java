package entities;

import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
public class Production {

    private String  movieName;
    private String productionName;

    public Production(){

    }

    public Production(String movieName,String productionName){

        this.movieName = movieName;
        this.productionName =productionName;
    }

    @Override
    public boolean equals(Object o) {

        Production production = (Production) o;
        return Objects.equals(productionName, production.productionName);
    }

    @Override
    public String toString() {
        return "Production{" +
                "movieName='" + movieName + '\'' +
                ", productionName='" + productionName + '\'' +
                '}';
    }
}
