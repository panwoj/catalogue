package pl.kubie.catalogue.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kubie.catalogue.domain.Item;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    @Override
    List<Item> findAll();

    Item findById(Long id);

    @Override
    Item save(Item item);

    void deleteById(Long itemId);

    List<Item> findByNameContains(String name);

    List<Item> findByAverageMark(Long mark);
}
