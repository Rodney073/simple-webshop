package com.smallproject.webshop.item;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/index")
    public String indexPage(Model model){
        model.addAttribute("items", itemService.getAllItems());
        return "index";
    }

    @GetMapping("/index/{id}")
    public String itemDetails(Model model, @PathVariable Long id) {
        model.addAttribute("popUpItem", itemService.findItemById(id));
        return "redirect:/index";
    }
}
