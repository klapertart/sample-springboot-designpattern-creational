package klapertart.lab.designpatterncreational.factoryabstract;

import klapertart.lab.designpatterncreational.factoryabstract.gopay.GopayCancelPaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.gopay.GopayChargePaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Configuration
public class GopayPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
