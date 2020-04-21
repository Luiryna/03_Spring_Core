package task2.service;

import task2.bean.Salary;

public class SalaryService {
    public void bindSalary(Salary salary, double percent) {
        salary.setAmount(salary.getAmount() * percent);
    }
}
