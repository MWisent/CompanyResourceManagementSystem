package com.CompanyResourceManagementSystem.storageManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Magazine {
    private List<Product> productList;

    public Magazine() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null && !productList.contains(product)) {
            productList.add(product);
        }
    }
    public void removeProduct(Product product) {
        if (product != null && productList.contains(product)) {
            productList.remove(product);
        }
    }
    public List<Product> getProductsByCategory(Categories category) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategories() == category) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public double totalPayment() {
        double total = 0.0;
        for (Product product : productList) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(productList, magazine.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productList);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "productList=" + productList +
                '}';
    }
}
