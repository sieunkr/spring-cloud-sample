package eddy.sample.eureka.front;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "member-api")
public interface MemberFeignClient {

    @GetMapping(value = "/api/v1/member")
    String getMemberInfo();
}