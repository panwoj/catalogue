package pl.kubie.catalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kubie.catalogue.domain.Item;
import pl.kubie.catalogue.repository.ItemRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DbService {
    @Autowired
    private ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public List<Item> getAllItemsByName(String name) {
        return repository.findByNameContains(name);
    }

    public List<Item> getAllItemsByMark(Long mark) {
        return repository.findByAverageMark(mark);
    }

    public Item getOneItem(Long id) {
        return repository.findById(id);
    }

    public Item saveItem(Item item) {
        return repository.save(item);
    }

    public void deleteItem(Long itemId) {
        repository.deleteById(itemId);
    }


}
