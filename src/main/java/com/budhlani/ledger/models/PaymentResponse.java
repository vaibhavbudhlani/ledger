package com.budhlani.ledger.models;

import lombok.Data;

@Data
public class PaymentResponse {

    private String receipt;
    private String ledgerResponse;
    private String walletResponse;
    private PaymentRequest paymentRequest;
}
