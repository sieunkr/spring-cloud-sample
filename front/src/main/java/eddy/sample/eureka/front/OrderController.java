package eddy.sample.eureka.front;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final ProductFeignClient productFeignClient;

    public OrderController(ProductFeignClient productFeignClient) {
        this.productFeignClient = productFeignClient;
    }

    @GetMapping
    public String getOrderInfo() {
        return productFeignClient.getProductInfo();
    }
}
