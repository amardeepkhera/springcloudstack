package my.springcloudstack.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "two")
public interface ServiceTwoClient {

    @RequestMapping("/two/hello")
    String hello();

    @RequestMapping("/two/goodBye")
    String goodBye();
}
