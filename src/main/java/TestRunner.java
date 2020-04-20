import bean.Salary;
import service.SalaryService;

public class TestRunner {
    public static void main(String[] args) {
        Salary salary1 = new Salary(200);
        Salary salary2 = new Salary(400);

        SalaryService salaryService = new SalaryService();

        salaryService.bindSalary(salary1, 0.8);
        System.out.println(salary1.toString());
    }
}
