package one.digitalinnovation.parking.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class LicenseNotFoundException extends RuntimeException {


    public LicenseNotFoundException(String license) {
        super("Parking not found with license: " + license);
    }
}
