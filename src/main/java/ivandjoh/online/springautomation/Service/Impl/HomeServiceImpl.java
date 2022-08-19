package ivandjoh.online.springautomation.Service.Impl;

import ivandjoh.online.springautomation.Service.HomeService;
import ivandjoh.online.springautomation.utils.ResponseUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {

    @Override
    public ResponseEntity getHomeService() {


        return ResponseUtils.getResponse("success", HttpStatus.OK.value(), "Hello World!");
    }
}
