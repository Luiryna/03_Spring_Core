package task3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task3.bean.Employee;
import task3.bean.Position;
import task3.bean.Salary;
import task3.service.EmployeeService;
import task3.service.PositionService;
import task3.service.SalaryService;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        PositionService positionService = (PositionService) context.getBean("positionService");
        SalaryService salaryService = (SalaryService) context.getBean("salaryService");

        Salary salary1 = (Salary) context.getBean("firstSalary");
        Salary salary2 = (Salary) context.getBean("secondSalary");
        Salary salary3 = (Salary) context.getBean("thirdSalary");

        Position tester = (Position) context.getBean("testerPosition");
        Position developer = (Position) context.getBean("developerPosition");
        Position analyst = (Position) context.getBean("analystPosition");

        Employee employee1 = (Employee) context.getBean("testerEmployee");
        Employee employee2 = (Employee) context.getBean("developerEmployee");
        Employee employee3 = (Employee) context.getBean("analystEmployee");

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
        System.out.println();

        System.out.println("<--February-->");
        System.out.println("Recounting developer's salary: ");
        salaryService.bindSalary(salary2, 1.2);
        System.out.println(developer.toString());
        System.out.println();

        System.out.println("<--March-->");
        System.out.println("Here is crisis! We should recount salaries, again :(");
        salaryService.bindSalary(salary1, 0.7);
        salaryService.bindSalary(salary2, 0.7);
        salaryService.bindSalary(salary3, 0.7);
        System.out.println(employeeService.toString());
        System.out.println();

        System.out.println("<--April-->");
        System.out.println("Situation in the world is too bad");
        employeeService.fire(employee1);
        employeeService.fire(employee2);
        employeeService.fire(employee3);
        System.out.println("All employees are fired, sorry. The end!");


    }
}
