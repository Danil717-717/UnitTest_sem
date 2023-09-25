package seminar_5.Task03_integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;




class OrderServiceTest {
    PaymentService mockPaymentService;
    OrderService service;

    @BeforeEach
    void setUp() {
        mockPaymentService = Mockito.mock(PaymentService.class);
        service = new OrderService(mockPaymentService);
    }

    @Test
    void placeOrder() {
        service.placeOrder("first", 34.3);
        Mockito.verify(mockPaymentService, Mockito.times(1))
                .processPayment("first", 34.3);

    }
}