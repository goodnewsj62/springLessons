package com.ltp.utilitythyme;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {
    @GetMapping("/util")
    public  String utility(Model  model){
        String name  =  "goodnews";
        model.addAttribute("name", name);
        return  "util";
    }

    @GetMapping("/styling")
    public String styling(){
        return "styling";
    }


    @GetMapping("/loops")
    public String loops(Model model){
        List<Role> roles =  Arrays.asList(
            new Role("Jim Halpet",  22,  "salesman"),
            new Role("Andy Benard",  38,  "salesman"),
            new Role("Pam Baesly",  32,  "receptionist"),
            new Role("Angela Martin",  22,  "salesman")

        );

        model.addAttribute("roles", roles);

        return "loops";
    }
}
