import task1.bean.Employee;
import task1.bean.Position;
import task1.bean.Salary;
import task1.service.PositionService;
import task1.service.SalaryService;

public class TestRunner {
    public static void main(String[] args) {
        Salary salary1 = new Salary(200);
        Salary salary2 = new Salary(400);

        SalaryService salaryService = new SalaryService();

        salaryService.bindSalary(salary1, 0.8);
        System.out.println(salary1.toString());

        Position position = new Position("pos1", salary1);

        Employee employee = new Employee("name1", position);

        PositionService positionService = new PositionService();
        positionService.create(position);


    }
}
