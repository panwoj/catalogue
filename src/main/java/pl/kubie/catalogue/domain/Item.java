package pl.kubie.catalogue.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "items")
public class Item {

    public Item(String name, Long averageMark, LocalDate date) {
        this.name = name;
        this.averageMark = averageMark;
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private Long averageMark;

    @Column(name = "created")
    private LocalDate date;
}
