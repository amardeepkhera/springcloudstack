package my.springcloudstack.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/two")
public class Two {

    private final RestTemplate restTemplate;


    private final String gatewayBaseUrl;

    public Two(RestTemplate restTemplate,
               @Value("${gateway.baseUrl}") String gatewayBaseUrl) {
        this.restTemplate = restTemplate;
        this.gatewayBaseUrl = gatewayBaseUrl;
    }


    @RequestMapping("/hello")
    public String sayHello() {
        log.info("service two says hello");
        return "Hello from service Two." + restTemplate.getForObject(gatewayBaseUrl + "/one/goodBye", String.class);
    }

    @RequestMapping("/goodBye")
    public String sayGoodBye() {
        log.info("service two says goodbye");
        return "Goodbye from service Two.";
    }
}
