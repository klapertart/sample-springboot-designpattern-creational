package klapertart.lab.designpatterncreational.factoryabstract;

public interface GetBalancePaymentRequest {
    String getUserId();

    void setUserId(String userId);

    PaymentMethod getMethod();
}
