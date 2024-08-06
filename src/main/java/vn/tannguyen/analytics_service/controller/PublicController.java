package vn.tannguyen.analytics_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.tannguyen.analytics_service.client.DataClient;

@RestController
@RequestMapping("")
public class PublicController {
    DataClient dataClient;

    public PublicController(DataClient dataClient) {
        this.dataClient = dataClient;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Analytics welcome";
    }

}
