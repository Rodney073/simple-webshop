package com.smallproject.webshop.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        return (List<Item>) this.itemRepository.findAll();
    }

    public Item findItemById (Long id) {
        return itemRepository.findItemById(id);
    }

    public void saveNewItem(String name, String description, String photoURL, int startingPrice){
        Item item = new Item(name, description, photoURL, startingPrice);
        itemRepository.save(item);
    }

    public void deleteItem (Long id) {
        itemRepository.deleteById(id);
    }
}
