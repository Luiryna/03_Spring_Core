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

        System.out.println("<--January-->");
        System.out.println("Creation of the company");

        positionService.create(tester);
        positionService.create(developer);
        positionService.create(analyst);

        System.out.println("Some positions created: ");
        System.out.println(positionService.toString());
        System.out.println("Some employees hired: ");

        employeeService.hire(employee1);
        employeeService.hire(employee2);
        employeeService.hire(employee3);

        System.out.println(employeeService.toString());

        System.out.println("<--February-->");
        System.out.println("Recounting developer's salary: ");
        salaryService.bindSalary(salary2, 1.2);
        System.out.println(developer.toString());

        System.out.println("<--March-->");
        System.out.println("Here is crisis! We should recount salaries, again :(");
        salaryService.bindSalary(salary1, 0.7);
        salaryService.bindSalary(salary2, 0.7);
        salaryService.bindSalary(salary3, 0.7);
        System.out.println(employeeService.toString());

        System.out.println("<--April-->");
        System.out.println("Situation in the world is too bad");
        employeeService.fire(employee1);
        employeeService.fire(employee2);
        employeeService.fire(employee3);
        System.out.println("All employees are fired, sorry. The end!");
    }
}
