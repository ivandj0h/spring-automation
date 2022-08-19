package ivandjoh.online.springautomation.Service.Impl;

import ivandjoh.online.springautomation.Dto.HttpResponse.HomeResponse;
import ivandjoh.online.springautomation.Service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public ResponseEntity getHomeService() {

        HomeResponse homeResponse = new HomeResponse();
        homeResponse.setStatus("OK");
        homeResponse.setStatusCode(200);
        homeResponse.setMessages("Welcome to Spring Automation!");


        return new ResponseEntity<>(homeResponse, HttpStatus.valueOf(homeResponse.getStatusCode()));
    }
}
