package service;

import bean.Employee;
import bean.Position;

import java.util.List;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {

    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hire(String name, Position position) {
        employees.add(new Employee(name, position));
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

}
