package my.springcloudstack.service;


import lombok.extern.slf4j.Slf4j;
import my.springcloudstack.client.ServiceTwoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/one")
public class ServiceOne {

    @Autowired
    ServiceTwoClient serviceTwoClient;

    @RequestMapping("/hello")
    public String sayHello() {
        log.info("service one says hello");
        return "Hello from service One." + serviceTwoClient.goodBye();
    }

    @RequestMapping("/goodBye")
    public String sayGoodBye() {
        log.info("service one says goodbye");
        return "Goodbye from service One.";
    }


}
