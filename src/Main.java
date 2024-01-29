import com.CompanyResourceManagementSystem.Company;
import com.CompanyResourceManagementSystem.staffEmployee.Employee;
import com.CompanyResourceManagementSystem.storageManagement.Categories;
import com.CompanyResourceManagementSystem.storageManagement.Magazine;
import com.CompanyResourceManagementSystem.storageManagement.Product;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Magazine magazine = new Magazine();

        // Produkty
        Product eggs = new Product("Jajka", Categories.EGGS, 20, 33.0, LocalDate.of(2024, 3, 18));
        Product honey = new Product("Miód Lipowy", Categories.HONEY, 10, 38.0, LocalDate.of(2027, 3, 18));
        Product cucumbers = new Product("Ogórki", Categories.VEGETABLES, 200, 2.0, LocalDate.now().plusDays(10));

        // Dodawanie produktów
        magazine.addProduct(eggs);
        magazine.addProduct(honey);
        magazine.addProduct(cucumbers);

        // Pobieranie produktów z kategorii FRUIT
        List<Product> fruitProducts = magazine.getProductsByCategory(Categories.VEGETABLES);
        for (Product product : fruitProducts) {
            System.out.println(product);
        }

        // Pracownicy
        Employee employee = new Employee(123, "Marcin", "Lolek", "Pracwonik na stanowisku sprzedawaca. Na namiocie nr 2", LocalTime.of(9, 0), LocalTime.of(17, 0));
        Employee employee1 = new Employee(123, "Weronika", "Masło", "Pracwonik na stanowisku sprzedawaca. Na namiocie nr 3", LocalTime.of(9, 0), LocalTime.of(17, 0));
        Employee employee2 = new Employee(123, "Sandra", "Kowalska", "Pracwonik na stanowisku sprzedawaca. Na namiocie nr 13", LocalTime.of(9, 0), LocalTime.of(17, 0));

        // Pobieranie pracowników na podstawie Imienia i Nazwiska
        company.addEmploy(employee);
        company.addEmploy(employee1);
        company.addEmploy(employee2);


        List<Employee> foundEmployeesByName = company.findEmployeesByName("Marcin");
        for (Employee employeeFound : foundEmployeesByName) {
            System.out.println("--------------------------------");
            employeeFound.displayInformation();
        }

        List<Employee> foundEmployeesByNameAndSurname = company.findEmployeesByNameAndSurname("Weronika", "Masło");
        for (Employee employeeFound : foundEmployeesByNameAndSurname) {
            System.out.println("--------------------------------");
            employeeFound.displayInformation();
        }




    }
}