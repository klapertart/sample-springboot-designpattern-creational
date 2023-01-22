package klapertart.lab.designpatterncreational.factoryabstract;

import klapertart.lab.designpatterncreational.factoryabstract.bcaklikpay.BCAKlikPayCancelPaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.bcaklikpay.BCAKlikPayChargePaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.bcaklikpay.BCAKlikPayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

@Configuration
public class BCAKlikPayPaymentFactory implements PaymentFactory{
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BCAKlikPayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BCAKlikPayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BCAKlikPayGetBalancePaymentRequest();
    }
}
