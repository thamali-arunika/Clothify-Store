package model.tm;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Payment {
    private String paymentId;
    private double cash;
    private double balance;
    private String date;
    private boolean isPayByCash;
    private String orderId;
}
