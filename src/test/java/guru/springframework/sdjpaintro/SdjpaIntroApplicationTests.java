package guru.springframework.sdjpaintro;

import guru.springframework.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SdjpaIntroApplicationTests {

    private BookRepository repository;

    @Autowired
    public SdjpaIntroApplicationTests(BookRepository repository) {
        this.repository = repository;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testBookRepository() {
        long count = repository.count();
        assertThat(count).isEqualTo(2);
    }

}
