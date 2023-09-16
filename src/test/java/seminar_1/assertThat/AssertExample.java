package seminar_1.assertThat;

public class AssertExample {
    public static void main(String[] args) {
        int x = -100;
        // Проверяем, что x неотрицательно с использованием
        // оператора assert
        //java -ea seminar_1.assertThat.AssertExample
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println("Программа продолжает выполнение");
    }
}
