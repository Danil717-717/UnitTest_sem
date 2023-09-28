package sem_6HW;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class List2Test {

    @Test
    void getList() {
        //Создаем список для теста
        List<Integer> arrayList = new ArrayList<>();

        //добавляем в него элементы
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        //Создаем экземпляр класса List2
        List2 list = new List2(arrayList);

        //Проверка атрибутов List1
        assertEquals(arrayList, list.getList());
    }
}