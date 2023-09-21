package sem_3HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {
    Task01 test01 = new Task01();
    @Test
    void evenOddNumber() {
        boolean result = test01.evenOddNumber(30);
        boolean result1 = test01.evenOddNumber(0);
        boolean result2 = test01.evenOddNumber(-2);

        assertEquals(true,result);
        assertEquals(true,result1);
        assertEquals(true,result2);
    }
}