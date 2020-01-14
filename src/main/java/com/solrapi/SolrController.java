package com.solrapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.com.solrapi.Item;
import java.com.solrapi.SolrItemRepository;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SolrController {

    @Autowired
    private SolrItemRepository ItemRepository;

    @RequestMapping("/")
    public String DoesNotMatch() {
        return "Error";
    }

    @PostMapping("/order")
    public String createItem(@RequestBody Item item) {
        String description = "Item Created";
        ItemRepository.save(item);
        return description;
    }

    @GetMapping("/item/{title}")
    public List<Item> findtItemByTitle(@PathVariable String title) {
        List<Item> items = new ArrayList<>();
        for(Item item : ItemRepository.findAll()){
            if(item.getTitle() == title){
                items.add(item);
            }
        }
        return items;


    }

    @GetMapping("/item/{descr}")
    public List<Item> findtItemByDescr(@PathVariable String descr) {

        List<Item> items = new ArrayList<>();
        for(Item item : ItemRepository.findAll()){
            if(item.getDescr().equals(descr)){
                items.add(item);
            }
        }
        return items;
        //return ItemRepository.findByDescr(descr);
    }
    @GetMapping("/item/{id}")
    public List<Item> findtItemById(@PathVariable Integer id) {
        List<Item> items = new ArrayList<>();
        for(Item item : ItemRepository.findAll()){
            if(item.getId().equals(id)){
                items.add(item);
            }
        }
        return items;


    }

    @PutMapping("/title")
    public String updateOrder(@RequestBody Item item) {
        String description = "Item Updated";
        ItemRepository.save(item);
        return description;
    }

    @DeleteMapping("/item/{title}")
    public String deleteItem(@PathVariable String title) {
        String description = "Item Deleted";
        ItemRepository.delete((Item) ItemRepository.findByTitle(title));
        return description;
    }






}
