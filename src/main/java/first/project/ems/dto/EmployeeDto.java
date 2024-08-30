package first.project.ems.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Data
public class EmployeeDto {
    private Long id;
    private String  firstName;
    private String   lastName;
    private String   email;

}
