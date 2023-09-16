package seminar_1.assertThat.tasks;

import static seminar_1.assertThat.tasks.Task03.sum;
import static org.assertj.core.api.Assertions.assertThat;

// Найти и исправить ошибку
public class Task05 {
    public static void main(String[] args) {
        expectedValue();
    }

    public static void expectedValue() {
        assertThat(sum(2, 3)).isEqualTo(5);
    }
}