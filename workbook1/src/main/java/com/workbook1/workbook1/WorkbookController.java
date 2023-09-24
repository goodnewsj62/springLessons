package com.workbook1.workbook1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WorkbookController {

    @GetMapping("/show")
    public String show(){
        return "show";
    }
    
}
