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
        return employeesList.stream().
                filter(employee -> employee.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
    public List<Employee> findEmployeesByNameAndSurname(String name, String surname) {
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
        productsList.remove(product);
        productsMap.remove(product);
    }
    public boolean getProduct(Product product) {
        return productsList.contains(product.getName());
    }
    // Metody do generowania raportów
    public void generateEmployeeReport() {
        // Implementacja
    }

    public void generateStockReport() {
        // Implementacja
    }

}
