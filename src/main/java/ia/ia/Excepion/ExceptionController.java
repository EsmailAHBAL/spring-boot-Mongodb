package ia.ia.Excepion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex) {
        List<String> d = new ArrayList<>();
        d.add(ex.getLocalizedMessage());

        return new ResponseEntity(ErrorResponse.builder()
                .details(d).Message(ex.getMessage())
                .StatusCode(HttpStatus.NOT_FOUND.toString())
                .time(new Date())
                .build()

                , HttpStatus.NOT_FOUND);
    }
}
