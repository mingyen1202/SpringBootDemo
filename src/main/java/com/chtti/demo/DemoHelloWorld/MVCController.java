package com.chtti.demo.DemoHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MVCController {
    @RequestMapping(value = "/ep4", method = RequestMethod.GET)
    public String ep4(@RequestParam(value = "name", required=false, defaultValue = "Marcus") String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("message", "spring message");
        return "hello";
    }

    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String ep5(Model model){
        model.addAttribute("msg", "transfer something from spring");
        return "success";
    }
}
