package eddy.sample.eureka.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/member")
public class MemberRestController {

    @GetMapping
    public String test() {
        return "member info";
    }
}