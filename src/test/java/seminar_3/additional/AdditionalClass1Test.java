package seminar_3.additional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionalClass1Test {

    @Test
    void customOperation() {
        AdditionalClass1 additionalClass1 = new AdditionalClass1();
        assert additionalClass1.customOperation(34, 45) < Integer.MAX_VALUE;
    }
}