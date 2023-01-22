package klapertart.lab.designpatterncreational.factoryabstract;

public interface PaymentFactory {
    ChargePaymentRequest createChargeRequest();
    CancelPaymentRequest createCancelRequest();
    GetBalancePaymentRequest createGetBalanceRequest();
}
