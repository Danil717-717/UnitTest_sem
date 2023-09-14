public class AssertExample {
    public static void main(String[] args) {
        int x = -100;
        // Проверяем, что x неотрицательно с использованием
        // оператора assert
        //java -ea AssertExample
        assert x >= 0 : "x должно быть неотрицательным";
        System.out.println("Программа продолжает выполнение");
    }
}
