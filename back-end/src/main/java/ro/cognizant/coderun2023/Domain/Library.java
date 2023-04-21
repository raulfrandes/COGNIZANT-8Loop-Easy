package ro.cognizant.coderun2023.Domain;

import jakarta.persistence.OneToMany;
import lombok.Getter;

import java.util.List;

@Getter
public class Library {
    @OneToMany(mappedBy = "library")
    private List<Book> books;
}
