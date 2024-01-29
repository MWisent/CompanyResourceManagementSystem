package com.CompanyResourceManagementSystem.storageManagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Product {
    private String name;
    private Categories categories;
    private int quantity;
    private double price;
    private LocalDate bestBeforeDate;

    public Product(String name, Categories categories, int quantity, double price, LocalDate bestBeforeDate) {
        this.name = name;
        this.categories = categories;
        this.quantity = quantity;
        this.price = price;
        this.bestBeforeDate = bestBeforeDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(LocalDate bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public void checkDateOfUse() {
        LocalDate TodayDate = LocalDate.now();
        long DaysTogo = ChronoUnit.DAYS.between(TodayDate, bestBeforeDate);
        if (DaysTogo < 0) {
            System.out.println(name + " - Produkt jest przeterminowany");
        } else if (DaysTogo <= 5) {
            System.out.println(name + " - Produkt zbliża się do końca terminu");
        } else {
            System.out.println(name + " - Produkt jest świeży");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && categories == product.categories && Objects.equals(bestBeforeDate, product.bestBeforeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, categories, quantity, price, bestBeforeDate);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", categories=" + categories +
                ", quantity=" + quantity +
                ", price=" + price +
                ", bestBeforeDate=" + bestBeforeDate +
                '}';
    }
}
