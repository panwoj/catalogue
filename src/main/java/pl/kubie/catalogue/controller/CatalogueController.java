package pl.kubie.catalogue.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kubie.catalogue.domain.Item;
import pl.kubie.catalogue.service.DbService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/catalogue")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class CatalogueController {
    @Autowired
    private DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "items")
    public List<Item> getItems() {
        return dbService.getAllItems();
    }

    @RequestMapping(method = RequestMethod.POST, value = "items")
    public void addItem(@RequestParam String name) {
        dbService.saveItem(new Item(name, (long) 0, LocalDate.now()));
    }

}
