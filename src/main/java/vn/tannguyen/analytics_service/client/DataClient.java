package vn.tannguyen.analytics_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "data-service")
public interface DataClient {
    @GetMapping("/auth/welcome")
    String welcome();
}
