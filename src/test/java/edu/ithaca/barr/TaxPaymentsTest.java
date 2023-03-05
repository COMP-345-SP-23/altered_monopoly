package edu.ithaca.barr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxPaymentsTest {
    
    @Test
    public void getPaymentTest(){
        TaxPayments taxPay = new TaxPayments("Income Tax", 200);
        assertEquals(200, taxPay.getPayment());
    }
}
