package sem_6HW;

public class ComparisonList {

    public void CompList(double num){
        if (num > 0) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (num < 0) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }

}
