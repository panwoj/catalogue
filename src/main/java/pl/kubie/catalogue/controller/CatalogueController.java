package pl.kubie.catalogue.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kubie.catalogue.domain.Item;
import pl.kubie.catalogue.service.DbService;

import java.time.LocalDate;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/catalogue")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class CatalogueController {
    @Autowired
    private DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "/items")
    public List<Item> getItems() {
        return dbService.getAllItems();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/items/name/{name}")
    public List<Item> getItemsByName(@PathVariable String name) {
        return dbService.getAllItemsByName(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/items/mark/{mark}")
    public List<Item> getItemsByName(@PathVariable Long mark) {
        return dbService.getAllItemsByMark(mark);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/items")
    public void addItem(@RequestParam String name) {
        dbService.saveItem(new Item(name, (long) 0));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/items/{itemId}")
    public void deleteItem(@PathVariable Long itemId) {
        dbService.deleteItem(itemId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/items")
    public Item editItem(@RequestParam Long itemId, String name) {
        Long currentMark = dbService.getOneItem(itemId).getAverageMark();
        return dbService.saveItem(new Item(itemId, name, currentMark, LocalDate.now() ));
    }

}
