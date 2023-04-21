package ro.cognizant.coderun2023.API_Layer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.cognizant.coderun2023.Business.BookService;
import ro.cognizant.coderun2023.Domain.Book;

import java.util.List;

@RestController
@RequestMapping()
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/{id}")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }
}
