package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This class is used to designed as controller.
 * @author shyam.pareek
 *
 */
@Controller
public class WebController {
    @RequestMapping(value= {"/", "/welcome"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="User") String name) {
        model.addAttribute("name", name);
        return "welcome";
    }
}
