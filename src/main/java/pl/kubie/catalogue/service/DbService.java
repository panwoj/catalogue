package pl.kubie.catalogue.service;

import org.springframework.stereotype.Service;
import pl.kubie.catalogue.domain.ItemDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DbService {

    public List<ItemDto> getAllItems() {
        List<ItemDto> theList = new ArrayList<>();
        theList.add(new ItemDto((long)1, "book", 5, LocalDate.now()));
        return theList;
    }
}
