package seminar_5.Task01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    @Test
    void generateNumbers() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        List<Integer> numbers = generator.generateNumbers(10);

        assertNotNull(numbers); // проверяем не пустой ли список
        assertEquals(10, numbers.size()); // проверяем что наш размер списка равен 10 элементам
    }
}