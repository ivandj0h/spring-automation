package ivandjoh.online.springautomation.utils;

import ivandjoh.online.springautomation.Dto.HttpResponse.HomeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {

    public static ResponseEntity<?> getResponse(String status, int statusCode, String messages) {

        HomeResponse homeResponse = new HomeResponse();
        homeResponse.setStatus(status);
        homeResponse.setStatusCode(statusCode);
        homeResponse.setMessages(messages);

        return new ResponseEntity<>(homeResponse, HttpStatus.valueOf(statusCode));
    }
}
