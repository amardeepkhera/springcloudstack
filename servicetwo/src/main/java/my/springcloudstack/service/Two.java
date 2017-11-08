package my.springcloudstack.service;

import lombok.extern.slf4j.Slf4j;
import my.springcloudstack.client.ServiceOneClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/two")
public class Two {

    @Autowired
    ServiceOneClient serviceOneClient;


    @RequestMapping("/hello")
    public String sayHello() {
        log.info("service two says hello");
        return "Hello from service Two." + serviceOneClient.goodBye();
    }

    @RequestMapping("/goodBye")
    public String sayGoodBye() {
        log.info("service two says goodbye");
        return "Goodbye from service Two.";
    }
}
