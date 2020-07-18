package eddy.sample.eureka.front;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-api")
public interface ProductFeignClient {

    @GetMapping(value = "/api/v1/product")
    String getProductInfo();
}