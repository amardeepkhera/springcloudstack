package my.springcloudstack.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "one")
public interface ServiceOneClient {

    @RequestMapping("/one/hello")
    String hello();

    @RequestMapping("/one/goodBye")
    String goodBye();
}
