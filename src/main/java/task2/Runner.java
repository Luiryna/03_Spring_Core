package task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task1.service.EmployeeService;
import task1.service.PositionService;
import task1.service.SalaryService;

public class Runner {
    private EmployeeService employeeService;
    private PositionService positionService;
    private SalaryService salaryService;

    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans2.xml");
        
    }

    @Autowired
    public void prepare(EmployeeService employeeService, PositionService positionService, SalaryService salaryService) {
        this.employeeService = employeeService;
        this.positionService = positionService;
        this.salaryService = salaryService;
    }
}
