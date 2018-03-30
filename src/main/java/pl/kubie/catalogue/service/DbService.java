package pl.kubie.catalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kubie.catalogue.domain.Item;
import pl.kubie.catalogue.repository.ItemRepository;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public void saveItem(Item item) {
        repository.save(item);
    }
}
