package klapertart.lab.designpatterncreational.factoryabstract;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryAbstractApplication.class)
class FactoryAbstractApplicationTest {

    @Autowired
    private ApplicationContext context;


    @Test
    void testAbsctracFactory() {
        CreditCardPaymentFactory creditCardPaymentFactory = context.getBean(CreditCardPaymentFactory.class);
        GopayPaymentFactory gopayPaymentFactory = context.getBean(GopayPaymentFactory.class);
        BCAKlikPayPaymentFactory bcaKlikPayPaymentFactory = context.getBean(BCAKlikPayPaymentFactory.class);

        charge(creditCardPaymentFactory);
        charge(gopayPaymentFactory);
        charge(bcaKlikPayPaymentFactory);
    }

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest chargeRequest = paymentFactory.createChargeRequest();
        chargeRequest.setId("xxx");
        chargeRequest.setAmount(1_000_000L);

        // kirim ke payment gateway

        System.out.println(chargeRequest);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest cancelRequest = paymentFactory.createCancelRequest();
        cancelRequest.setId("xxx");

        //kirim ke payment gateway

        System.out.println(cancelRequest);
    }

    public Long getBalance(PaymentFactory paymentFactory){
        try{
            GetBalancePaymentRequest getBalanceRequest = paymentFactory.createGetBalanceRequest();
            getBalanceRequest.setUserId("otong");

            // kirim ke payment gateway

            return 1000L;
        }catch (UnsupportedOperationException ex){
            return 0L;
        }
    }

}