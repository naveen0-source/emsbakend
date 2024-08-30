package first.project.ems.mapper;

import first.project.ems.dto.EmployeeDto;
import first.project.ems.entity.Employee;
import lombok.Data;

@Data
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

   public static  Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
   }

}


