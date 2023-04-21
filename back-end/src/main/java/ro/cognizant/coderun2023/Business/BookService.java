package ro.cognizant.coderun2023.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.cognizant.coderun2023.API_Layer.BookController;
import ro.cognizant.coderun2023.Domain.Book;
import ro.cognizant.coderun2023.Repositor.BookRepository;

import java.util.Collections;
import java.util.List;

@Service
public class BookService {
    public BookController contr;
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
