package seminar_5.Task01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberFinderTest {

    @Test
    void findMax() {

        MaxNumberFinder finder = new MaxNumberFinder();
        List<Integer> numbers = Arrays.asList(3, 7, 1, 9, 2, 6, 8);

        int max = finder.findMax(numbers);

        assertEquals(9, max); // проверяем чот самое большое число в списке равно 9

    }

    @Test
    void testFindMax() {
        MaxNumberFinder finder = new MaxNumberFinder();
        List<Integer> emptyList = Arrays.asList();

        assertThrows(IllegalArgumentException.class, () -> finder.findMax(emptyList)); // проверяем что если список пуст то выкидываем исключение

    }
}