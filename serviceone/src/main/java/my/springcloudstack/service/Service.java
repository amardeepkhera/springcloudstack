package my.springcloudstack.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequestMapping("/one")
public class Service {

    private final RestTemplate restTemplate;

    private final String gatewayBaseUrl;

    public Service(RestTemplate restTemplate,
                   @Value("${gateway.baseUrl}") String gatewayBaseUrl) {
        this.restTemplate = restTemplate;
        this.gatewayBaseUrl = gatewayBaseUrl;
    }

    @RequestMapping("/hello")
    public String sayHello() {
        log.info("service one says hello");
        return "Hello from service One." + restTemplate.getForObject(gatewayBaseUrl + "/two/goodBye", String.class);
    }

    @RequestMapping("/goodBye")
    public String sayGoodBye() {
        log.info("service one says goodbye");
        return "Goodbye from service One.";
    }


}
