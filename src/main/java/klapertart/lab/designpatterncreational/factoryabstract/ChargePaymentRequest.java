package klapertart.lab.designpatterncreational.factoryabstract;


public interface ChargePaymentRequest {
    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    PaymentMethod getMethod();
}
