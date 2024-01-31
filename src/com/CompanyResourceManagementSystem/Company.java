package com.CompanyResourceManagementSystem;

import com.CompanyResourceManagementSystem.staffEmployee.Employee;
import com.CompanyResourceManagementSystem.staffEmployee.Partner;
import com.CompanyResourceManagementSystem.storageManagement.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
    private List<Employee> employeesList;
    private List<Partner> partnerList;
    private List<Product> productsList;
    private Map<Integer, Employee> employeesMap;
    private Map<String, Product> productsMap;

    public Company() {
        this.employeesList = new ArrayList<>();
        this.partnerList = new ArrayList<>();
        this.productsList = new ArrayList<>();
        this.employeesMap = new HashMap<>();
        this.productsMap = new HashMap<>();
    }
    // Metoda zarządzające pracownikami
    public  void addEmploy(Employee employee) {
        employeesList.add(employee);
        employeesMap.put(employee.getId(), employee);
    }
    public void removeEmploy(Employee employee) {
        if (employee == null || !employeesList.contains(employee)) {
            throw new IllegalArgumentException("Employee cannot be null and must exist in the list");
        }
        employeesList.remove(employee.getId());
        employeesMap.remove(employee.getId());
    }
    public boolean getEmployee(Employee employee) {
        return employeesList.contains(employee);
    }
    public Employee searchEmployee(Employee employee) {
        return employeesMap.get(employee);
    }

    public List<Employee> findEmployeesByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        return employeesList.stream().
                filter(employee -> employee.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
    public List<Employee> findEmployeesByNameAndSurname(String name, String surname) {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Name and surname cannot be null!");
        }
        return employeesList.stream().
                filter(employee -> employee.getName().equalsIgnoreCase(name) && employee.getSurname().equalsIgnoreCase(surname))
                .collect(Collectors.toList());
    }
    // Metoda zarządzające towarem
    public void addProduct(Product product) {
        productsList.add(product);
        productsMap.put(product.getName(), product);
    }
    public void removeProduct(Product product) {
        if (product == null || !employeesList.contains(product)) {
            throw new IllegalArgumentException("Employee cannot be null and must exist in the list");
        }
        productsList.remove(product);
        productsMap.remove(product);
    }
    public boolean getProduct(Product product) {
        return productsList.contains(product.getName());
    }
    public Product searchProduct(Product product) {
        return productsMap.get(product);
    }
    public List<Employee> findProductByName(String name) {
        return employeesList.stream().
                filter(employee -> employee.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
    
    // Metody do generowania raportów
    public void generateEmployeeReport() {
        // Implementacja
    }

    public void generateStockReport() {
        // Implementacja
    }

}
