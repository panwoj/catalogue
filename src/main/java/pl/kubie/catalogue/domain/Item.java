package pl.kubie.catalogue.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Item {
    private Long id;
    private String name;
    private Integer averageMark;
    private LocalDate date;
}
