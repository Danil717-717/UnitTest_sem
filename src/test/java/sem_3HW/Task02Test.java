package sem_3HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    Task02 task02 = new Task02();
    @Test
    void numberInInterval() {
        boolean res = task02.numberInInterval(26);
        assertTrue(res);
    }
}