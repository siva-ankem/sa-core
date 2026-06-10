package com.sa.core.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sa.core.models.Employee;
import com.sa.core.util.CommonUtil;

public class StreamsMain {
        public static void main(String[] args) {
                System.out.println("StreamsMain application started.");

                List<Employee> employeeList = CommonUtil.getEmployeeList();
                System.out.println("Filter employees with salary greater than 70000 and print their names:");
                employeeList.stream()
                                .filter(employee -> employee.getSalary() > 70000)
                                .map(Employee::getFirstName)
                                .forEach(System.out::println);

                System.out.println(
                                "\nGroup employees by department and count the number of employees in each department:");
                employeeList.stream().sorted((e1, e2) -> e1.getFirstName().compareTo(e2.getFirstName()))
                                .forEach(employee -> System.out
                                                .println(employee.getDepartment() + ": " + employee.getFirstName()));

                System.out.println("\nSort the elements in the list with comparator:");
                employeeList.parallelStream().filter(e -> e.getEmail().contains("n@"))
                                .sorted(Comparator.comparing(Employee::getFirstName))
                                .forEach(employee -> System.out.println(
                                                employee.getEmail() + ": " + employee.getFirstName() + " "
                                                                + employee.getLastName()));

                System.out.println("\nFind the employee with the highest salary:");
                employeeList.stream()
                                .max(Comparator.comparing(Employee::getSalary))
                                .ifPresent(Employee -> System.out
                                                .println(Employee.getFirstName() + " " + Employee.getLastName() + ": "
                                                                + Employee.getSalary()));

                System.out.println("\nfind the second highest salary:");
                employeeList.stream()
                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                .skip(1)
                                .findFirst()
                                .ifPresent(Employee -> System.out.println(
                                                Employee.getFirstName() + " " + Employee.getLastName() + ": "
                                                                + Employee.getSalary()));

                System.out.println("\nsort the employees by their first name and department:");
                employeeList.stream()
                                .sorted(Comparator.comparing(Employee::getFirstName)
                                                .thenComparing(Employee::getDepartment))
                                .forEach(employee -> System.out.println(
                                                employee.getFirstName() + " " + employee.getLastName() + ": "
                                                                + employee.getDepartment()));

                System.out.println("\nfind the average salary of employees in each department:");
                employeeList.stream()
                                .collect(Collectors.groupingBy(Employee::getDepartment,
                                                Collectors.averagingDouble(Employee::getSalary)))
                                .forEach((department, avgSalary) -> System.out
                                                .println(department + ": " + String.format("%.2f", avgSalary)));

                System.out.println(
                                "\ncreate the map from employees with employee ID as key and employee object as value:");
                employeeList.stream()
                                .collect(Collectors.toMap(Employee::getEmployeeId, e -> e))
                                .forEach((id, employee) -> System.out
                                                .println(id + ": " + employee.getFirstName() + " "
                                                                + employee.getLastName()));

                System.out.println("StreamsMain application finished.");
        }
}
