package service;

import bean.Salary;

public class SalaryService {
    public void bindSalary(Salary salary, double percent) {
        salary.setAmount(salary.getAmount() * percent);
    }
}
