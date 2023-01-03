package pl.xyz.cadmus.infrastructure;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ErrorResponse handleRuntimeException(RuntimeException exc) {
        return new ErrorResponse() {
            @Override
            public HttpStatusCode getStatusCode() {
                return HttpStatusCode.valueOf(500);
            }

            @Override
            public ProblemDetail getBody() {
                ProblemDetail problemDetail = ProblemDetail.forStatus(500);
                problemDetail.setDetail(exc.getLocalizedMessage());

                return problemDetail;
            }
        };
    }
}
