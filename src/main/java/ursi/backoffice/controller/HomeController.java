package ursi.backoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by claebo_c on 13/09/16.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String home(){
        return "index";
    }
}
