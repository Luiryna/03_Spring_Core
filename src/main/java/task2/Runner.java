package task2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.service.EmployeeService;
import task2.service.PositionService;
import task2.service.SalaryService;

public class Runner {
    private EmployeeService employeeService;
    private PositionService positionService;
    private SalaryService salaryService;

    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("beans2.xml");

    }

}
