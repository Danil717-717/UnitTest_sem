package seminar_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
// Импортируем необходимые классы из библиотек
import static org.assertj.core.api.Assertions.assertThat;

public class Main {

    @Test
    public void testAssertions() {
        // Примеры использования AssertJ для проверки утверждений

        // Создаем строку для тестирования
        String text = "Hello, World";

        // Проверяем, что строка не равна null
        Assertions.assertThat(text).isNotNull();
        // Проверяем, что строка начинается с "Hello"
        Assertions.assertThat(text).startsWith("Hello");

        // Проверяем, что строка заканчивается на "World"
        Assertions.assertThat(text).endsWith("World");

        // Проверяем, что строка содержит подстроку "lo, W"
        Assertions.assertThat(text).contains("lo, W");
    }
}