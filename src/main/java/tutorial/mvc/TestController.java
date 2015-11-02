package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ionatan on 11/2/2015.
 */

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
