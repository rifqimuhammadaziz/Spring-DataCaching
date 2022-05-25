package rifqimuhammadaziz.springdatacaching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rifqimuhammadaziz.springdatacaching.service.HeavyService;

@RestController
@RequestMapping("/api/data")
public class HeavyController {

    @Autowired
    private HeavyService heavyService;

    @GetMapping()
    public String getData() {
        return heavyService.getSomeData();
    }
}
