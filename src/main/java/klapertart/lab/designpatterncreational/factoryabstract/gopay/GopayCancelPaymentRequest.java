package klapertart.lab.designpatterncreational.factoryabstract.gopay;

import klapertart.lab.designpatterncreational.factoryabstract.CancelPaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */
public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
