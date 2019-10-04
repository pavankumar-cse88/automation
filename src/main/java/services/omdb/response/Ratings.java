package services.omdb.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ratings {

    private String Value;

    private String Source;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getSource ()
    {
        return Source;
    }

    public void setSource (String Source)
    {
        this.Source = Source;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Source = "+Source+"]";
    }
}
