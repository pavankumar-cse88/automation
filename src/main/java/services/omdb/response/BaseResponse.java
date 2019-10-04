package services.omdb.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {

    protected int httpStatusCode;
    protected String message;
}
