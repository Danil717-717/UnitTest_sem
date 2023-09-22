package sem_4HW;

import java.util.List;

public interface BookRepository {
    Book findById(String id);
    List<Book> findAll();
}
