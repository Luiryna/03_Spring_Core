package task1;

import task1.bean.Employee;
import task1.bean.Position;
import task1.bean.Salary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task1.service.EmployeeService;
import task1.service.PositionService;
import task1.service.SalaryService;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService");
        PositionService positionService = (PositionService) applicationContext.getBean("positionService");
        SalaryService salaryService = (SalaryService) applicationContext.getBean("salaryService");

        Salary salary1 = (Salary) applicationContext.getBean("salary1");
        Salary salary2 = (Salary) applicationContext.getBean("salary2");
        Salary salary3 = (Salary) applicationContext.getBean("salary3");

        Position tester = (Position) applicationContext.getBean("tester");
        Position developer = (Position) applicationContext.getBean("developer");
        Position analyst = (Position) applicationContext.getBean("analyst");

        Employee employee1 = (Employee) applicationContext.getBean("employee1");
        Employee employee2 = (Employee) applicationContext.getBean("employee2");
        Employee employee3 = (Employee) applicationContext.getBean("employee3");

        System.out.println(employee1.toString());



    }
}
