package task1.service;

import task1.bean.Employee;
import task1.bean.Position;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeService {
    private Set<Employee> employees = new HashSet<>();

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

    @Override
    public String toString() {
        return "EmployeeService{" +
                "employees=" + employees +
                '}';
    }
}
