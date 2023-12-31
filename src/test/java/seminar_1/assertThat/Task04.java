package seminar_1.assertThat;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Task04 {


    public static void main(String[] args) {
// Проверка на выбрасывание исключения
        assertThatThrownBy(() -> divide(10, 0)).isInstanceOf(ArithmeticException.class);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
