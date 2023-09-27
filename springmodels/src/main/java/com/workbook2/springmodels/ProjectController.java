package com.workbook2.springmodels;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.workbook2.springmodels.models.Show;

@Controller
public class ProjectController {
    
    @GetMapping("/shows")
    public String getGrade(Model model){
        model.addAttribute("first", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.addAttribute("second", new Show("Attack on Titan", "Hero", 9.9));
        model.addAttribute("third", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));
        model.addAttribute("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        return "shows";
    }
    @GetMapping("/shows-two")
    public ModelAndView getGrades(){
        Map<String,Show> model = new HashMap<String,Show>();
        model.put("first", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.put("second", new Show("Attack on Titan", "Hero", 9.9));
        model.put("third", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));
        model.put("fourth", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));

        return new ModelAndView("shows", model);
    }
}
