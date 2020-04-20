package task1.service;

import task1.bean.Salary;

public class SalaryService {
    public void bindSalary(Salary salary, double percent) {
        salary.setAmount(salary.getAmount() * percent);
    }
}
