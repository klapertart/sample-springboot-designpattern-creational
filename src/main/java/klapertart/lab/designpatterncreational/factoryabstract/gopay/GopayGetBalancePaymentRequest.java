package klapertart.lab.designpatterncreational.factoryabstract.gopay;

import klapertart.lab.designpatterncreational.factoryabstract.GetBalancePaymentRequest;
import klapertart.lab.designpatterncreational.factoryabstract.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */
public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {
    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
