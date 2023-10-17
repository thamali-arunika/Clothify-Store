package model.tm;

import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employer {
    private String empId;
    private String title;
    private String name;
    private String nic;
    private LocalDate dob;
    private String address;
    private String bankAccNo;
    private String bankBranch;
    private String contactNo;
}
