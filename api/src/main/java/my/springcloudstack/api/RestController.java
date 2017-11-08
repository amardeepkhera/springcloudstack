package my.springcloudstack.api;


import my.springcloudstack.client.ServiceOneClient;
import my.springcloudstack.client.ServiceTwoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestController {

    @Autowired
    ServiceOneClient serviceOneClient;
    @Autowired
    ServiceTwoClient serviceTwoClient;

    @RequestMapping("/")
    public ResponseEntity<String> callService(@RequestParam("serviceName") String serviceName) {
        if ("one".equalsIgnoreCase(serviceName)) {
            return ResponseEntity.ok(serviceOneClient.hello());
        }
        if ("two".equalsIgnoreCase(serviceName)) {
            return ResponseEntity.ok(serviceTwoClient.hello());
        }
        return ResponseEntity.badRequest().build();
    }

}
