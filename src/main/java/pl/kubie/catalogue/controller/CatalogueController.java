package pl.kubie.catalogue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kubie.catalogue.domain.ItemDto;
import pl.kubie.catalogue.service.DbService;

import java.util.List;

@RestController
@RequestMapping("/v1/catalogue")
public class CatalogueController {
    @Autowired
    private DbService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "items")
    public List<ItemDto> getItems() {
        return dbService.getAllItems();
    }
}
