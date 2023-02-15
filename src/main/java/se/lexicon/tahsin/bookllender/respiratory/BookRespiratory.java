package se.lexicon.tahsin.bookllender.respiratory;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Book extends CrudRepository {
    List<Book> findByTitle (String title);
    Boolean existByAvailable (boolean available);
    Book findByReserved (boolean Book);
}
