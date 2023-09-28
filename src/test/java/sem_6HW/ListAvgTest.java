package sem_6HW;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static seminar_1.tasks.Task03.sum;

class ListAvgTest {

    @Test
    void getAverage() {

        ListAvg listAvg = new ListAvg();

        //Создаем список для теста
        List<Integer> arrayList = new ArrayList<>();

        //добавляем в него элементы
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Проверяем, что список не равен null
        Assertions.assertThat(arrayList).isNotNull();

        // Проверяем, что работу метода по нахождению среднего арифметич
        double result = listAvg.getAverage(arrayList);
        assertEquals(3,result);

    }
}