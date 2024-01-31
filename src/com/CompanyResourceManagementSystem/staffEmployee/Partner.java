package com.CompanyResourceManagementSystem.staffEmployee;

public class Partner extends Person {

    public Partner(int id, String name, String surname, String termsOfReference) {
        super(id, name, surname, termsOfReference);
    }

    public void checkingPartner(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("id must be greater than 0");
        }
        System.out.println("Employee is Partner");
    }

    @Override
    public void displayInformation() {
        System.out.println("Pracownika: " + name + " " + surname + "\n" + "Stanowisko: " + getTermsOfReference());
    }
}
