package com.ltp.workbook31;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;


@Controller
public class AppController {


    @GetMapping("/")
    public String getForm(Model model){
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @GetMapping("/result")
    public String getResult(){
        return "result";
    }


    @PostMapping("/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result,RedirectAttributes reAttrs){
        if(!result.hasErrors() && user.getFirstName().equals(user.getLastName())){
            result.rejectValue("lastName", "", null,"Please lastname cannot be same as firstname");
            return "sign-up";
        }

        if(result.hasErrors()){
            return "sign-up";
        }
        return "redirect:/result";
    }
}
