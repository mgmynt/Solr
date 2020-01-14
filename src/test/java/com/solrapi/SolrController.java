package com.solrapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return ItemRepository.findByTitle(title);
    }

    @GetMapping("/item/{descr}")
    public List<Item> findtItemByDescr(@PathVariable String descr) {
        return ItemRepository.findByDescr(descr);
    }
    @GetMapping("/item/{id}")
    public Item findtItemByTitle(@PathVariable Integer id) {
        return (Item) ItemRepository.findItById(id);
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
