package task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task3.bean.Employee;
import task3.bean.Position;
import task3.bean.Salary;
import task3.service.EmployeeService;
import task3.service.PositionService;
import task3.service.SalaryService;

@Configuration
public class AppConfig {
    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Bean
    public PositionService positionService() {
        return new PositionService();
    }

    @Bean
    public SalaryService salaryService() {
        return new SalaryService();
    }

    @Bean
    public Salary firstSalary() {
        return new Salary(100);
    }

    @Bean
    public Salary secondSalary() {
        return new Salary(200);
    }

    @Bean
    public Salary thirdSalary() {
        return new Salary(300);
    }

    @Bean
    public Position testerPosition() {
        return new Position("tester", firstSalary());
    }

    @Bean
    public Position developerPosition() {
        return new Position("developer", secondSalary());
    }

    @Bean
    public Position analystPosition() {
        return new Position("analyst", thirdSalary());
    }

    @Bean
    public Employee testerEmployee() {
        return new Employee("Ann", testerPosition());
    }

    @Bean
    public Employee developerEmployee() {
        return new Employee("Mark", developerPosition());
    }

    @Bean
    public Employee analystEmployee() {
        return new Employee("Katya", analystPosition());
    }
}
