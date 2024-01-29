package com.CompanyResourceManagementSystem.staffEmployee;

public class Partner extends Person {
    private final int  ID_ADMIN = 1;


    public Partner(int id, String name, String surname, String termsOfReference) {
        super(id, name, surname, termsOfReference);
    }


    @Override
    public void displayInformation() {
        System.out.println("Pracownika: " + name + " " + surname + "\n" + "Stanowisko: " + getTermsOfReference());
    }
}
