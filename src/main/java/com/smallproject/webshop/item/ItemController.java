package com.smallproject.webshop.item;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public String itemDetails(@PathVariable ("id") Long id, Model model) {
        model.addAttribute("popUpItem", itemService.findItemById(id));
        return "redirect:/index";
    }

    @PostMapping("/index/save")
    public String addNewItem(@ModelAttribute Item item) {
        itemService.saveNewItem(item.getName(), item.getDescription(),
                item.getPhotoURL(), item.getStartingPrice());
        return "redirect:/index";
    }

    @GetMapping ("/index/delete/{id}")
    public String deleteItem(@PathVariable ("id") Long id) {
        itemService.deleteItem(id);
        return "redirect:/index";
    }
}
