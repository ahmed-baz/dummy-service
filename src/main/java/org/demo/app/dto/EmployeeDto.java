package org.demo.app.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EmployeeDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal salary;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private LocalDate joinDate;

}


