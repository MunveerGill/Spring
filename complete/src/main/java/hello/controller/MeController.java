package hello.controller;

import hello.model.Me;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mgill on 24/02/2016.
 */
@RestController
public class MeController {

    @RequestMapping("/me")
    public Me me(@RequestParam(value = "random", defaultValue = "YOLO") String random){
        return new Me(random);
    }

}
