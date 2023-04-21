package ro.cognizant.coderun2023.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
public class Book {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String publisher;

//    //@ManyToOne
//    @JoinColumn(name = "library_id")
//    private Library library;

    public Book(Long id, String name, String author, String publisher){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }


}
