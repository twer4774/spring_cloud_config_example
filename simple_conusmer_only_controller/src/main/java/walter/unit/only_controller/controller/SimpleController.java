package walter.unit.only_controller.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SimpleController {

    @Value("${example.name}")
    private String name;

    @Value("${example.type}")
    private String type;

    @GetMapping("")
    public String simple(){
        return "name: " + name + " / type: " + type;
    }
}
