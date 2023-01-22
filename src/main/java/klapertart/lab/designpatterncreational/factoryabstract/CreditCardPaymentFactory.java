package klapertart.lab.designpatterncreational.factoryabstract;

import klapertart.lab.designpatterncreational.factoryabstract.creditcard.CreditCardCancelPaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.creditcard.CreditCardChargePaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new CreditCardGetBalancePaymentRequest();
    }
}
