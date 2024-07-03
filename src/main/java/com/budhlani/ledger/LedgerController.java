package com.budhlani.ledger;

import com.budhlani.ledger.models.PaymentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/ledger")
public class LedgerController {

       @PostMapping("/events")
       public Mono<String> getPaymentResponse(@RequestBody PaymentResponse paymentResponse){
           System.out.println(paymentResponse);
           return Mono.just("Ledger Response "+paymentResponse.getReceipt());
       }
}
