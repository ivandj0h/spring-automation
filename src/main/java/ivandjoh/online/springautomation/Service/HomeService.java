package ivandjoh.online.springautomation.Service;

import ivandjoh.online.springautomation.Dto.HttpResponse.HomeResponse;
import org.springframework.http.ResponseEntity;

public interface HomeService {
    ResponseEntity<HomeResponse> getHomeService();
}
