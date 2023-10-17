package model.tm;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Supplier {
    private String supplierId;
    private String title;
    private String supplierName;
    private String contact;
    private String company;
    private String email;
}
