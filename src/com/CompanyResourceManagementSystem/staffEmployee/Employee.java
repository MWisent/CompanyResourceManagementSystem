package com.CompanyResourceManagementSystem.staffEmployee;


import java.time.LocalTime;
import java.util.Objects;

public class Employee extends Person {
    private Position position;
    private LocalTime startingTime;
    private LocalTime finishingTime;

    public Employee(int id, String name, String surname, String termsOfReference, LocalTime startingTime, LocalTime finishingTime) {
        super(id, name, surname, termsOfReference);
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public LocalTime getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(LocalTime finishingTime) {
        this.finishingTime = finishingTime;
    }

    @Override
    public void displayInformation() {
        System.out.println("Pracownika: " + name + " " + surname + "\n" + "Stanowisko: " + getTermsOfReference());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return position == employee.position && Objects.equals(startingTime, employee.startingTime) && Objects.equals(finishingTime, employee.finishingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingTime, finishingTime);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "startingTime=" + startingTime +
                ", finishingTime=" + finishingTime +
                '}';
    }
}
