package com.sa.core.util;

import java.util.List;

import com.sa.core.models.Employee;

public class CommonUtil {
    public static List<Employee> getEmployeeList() {
        return List.of(
                new Employee("E001", "John", "Doe", "john.doe@company.com", "Engineering", 75000.0, "123 Main St"),
                new Employee("E002", "Jane", "Smith", "jane.smith@company.com", "Marketing", 65000.0, "456 Oak Ave"),
                new Employee("E003", "Alice", "Johnson", "alice.johnson@company.com", "Sales", 70000.0, "789 Pine Rd"),
                new Employee("E004", "Bob", "Brown", "bob.brown@company.com", "HR", 60000.0, "321 Elm St"),
                new Employee("E005", "Charlie", "Davis", "charlie.davis@company.com", "Finance", 72000.0,
                        "654 Cedar Ln"),
                new Employee("E006", "Eve", "Wilson", "eve.wilson@company.com", "Operations", 68000.0, "987 Maple Dr"),
                new Employee("E007", "Frank", "Miller", "frank.miller@company.com", "IT", 78000.0, "147 Oak St"),
                new Employee("E008", "Grace", "Taylor", "grace.taylor@company.com", "Marketing", 66000.0,
                        "369 Birch Ln"),
                new Employee("E009", "Hank", "Anderson", "hank.anderson@company.com", "Operations", 69000.0,
                        "987 Maple Dr"),
                new Employee("E010", "Ivy", "Thomas", "ivy.thomas@company.com", "HR", 64000.0, "258 Spruce St"));
    }
}
