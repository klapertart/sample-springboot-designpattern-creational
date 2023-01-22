package klapertart.lab.designpatterncreational.factoryabstract.bcaklikpay;

import klapertart.lab.designpatterncreational.factoryabstract.ChargePaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */
public class BCAKlikPayChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
