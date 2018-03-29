package pl.kubie.catalogue.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.kubie.catalogue.domain.ItemDto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/catalogue")
public class CatalogueController {
    @RequestMapping(method = RequestMethod.GET, value = "items")
    public List<ItemDto> getItems() {
        return new ArrayList<>();
    }
}
