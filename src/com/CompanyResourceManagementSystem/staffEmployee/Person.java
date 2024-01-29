package com.CompanyResourceManagementSystem.staffEmployee;

public abstract class Person {
    private int id;
    protected String name;
    protected String surname;
    protected String termsOfReference;

    public Person(int id, String name, String surname, String termsOfReference) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.termsOfReference = termsOfReference;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTermsOfReference() {
        return termsOfReference;
    }

    public void setTermsOfReference(String termsOfReference) {
        termsOfReference = termsOfReference;
    }

    public abstract void displayInformation();
}
