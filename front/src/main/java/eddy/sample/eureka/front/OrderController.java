package eddy.sample.eureka.front;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final ProductFeignClient productFeignClient;
    private final MemberFeignClient memberFeignClient;

    public OrderController(ProductFeignClient productFeignClient, MemberFeignClient memberFeignClient) {
        this.productFeignClient = productFeignClient;
        this.memberFeignClient = memberFeignClient;
    }

    @GetMapping("/product")
    public String getProductInfo() {
        return productFeignClient.getProductInfo();
    }

    @GetMapping("/member")
    public String getMemberInfo() {
        return memberFeignClient.getMemberInfo();
    }
}