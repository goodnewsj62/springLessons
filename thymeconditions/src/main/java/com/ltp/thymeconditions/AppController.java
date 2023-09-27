package com.ltp.thymeconditions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping("/addition")
    public String addVal(Model model){
        model.addAttribute("speed", 45);
        return "add";
    }

}
