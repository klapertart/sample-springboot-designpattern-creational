package klapertart.lab.designpatterncreational.factoryabstract;

/**
 * @author kurakuraninja
 * @since 22/01/23
 */

public interface CancelPaymentRequest {
    String getId();

    void setId(String id);

    PaymentMethod getMethod();
}
