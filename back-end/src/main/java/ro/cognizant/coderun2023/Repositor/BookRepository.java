package ro.cognizant.coderun2023.Repositor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.cognizant.coderun2023.Domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
