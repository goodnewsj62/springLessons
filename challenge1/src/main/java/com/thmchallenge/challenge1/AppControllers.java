package com.thmchallenge.challenge1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AppControllers {
    private static final int NOT_FOUND =  -1;
    private List<Item> items =  new ArrayList<>();

    @GetMapping("/")
    public String getForm(Model model,  @RequestParam(required=false) String id){
        model.addAttribute("categories", Constants.CATEGORIES);
        model.addAttribute("item", this.getItem(id));
        return "form";
    }


    @GetMapping("/inventory")
    public String getInventory(Model model ){
        model.addAttribute("items", items);
        return "inventory";
    }

    @PostMapping("/submitItem")
    public String handleSubmit(Item item,  RedirectAttributes redirectAttr){
        int index =  this.getItemIndex(item.getId());
        if(index == NOT_FOUND){
            items.add(item);
            redirectAttr.addFlashAttribute("success", "new item successfully created");
        }
        else{
            redirectAttr.addFlashAttribute("success", "item has been successfully updated");
            items.set(index, item);
        }
        return "redirect:/inventory";
    }

    private int getItemIndex(String id){
        if(id ==  null) return NOT_FOUND;
        for(int i = 0; i < this.items.size();  i++){
            if( items.get(i).getId().equals(id)) return i;
        }
        return NOT_FOUND;
    }


    private Item  getItem(String id){
        int index =  this.getItemIndex(id);
        if(index == NOT_FOUND) return new Item();
        return items.get(index);
    }
}
