package peaksoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 13:25
 **/
@Controller

public class HospitalController {
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String mainPage() {
        return "index";
    }
}
