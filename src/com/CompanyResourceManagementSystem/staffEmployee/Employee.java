package com.CompanyResourceManagementSystem.staffEmployee;


import java.time.LocalTime;
import java.util.Objects;

public class Employee extends Person {
    private LocalTime startingTime;
    private LocalTime finishingTime;

    public Employee(int id, String name, String surname, String termsOfReference, LocalTime startingTime, LocalTime finishingTime) {
        super(id, name, surname, termsOfReference);
        if (startingTime == null || finishingTime == null) {

            throw new IllegalArgumentException("Starting time and finishing time cannot be null");
        }
        if (finishingTime == null || startingTime == null) {
            throw new IllegalArgumentException("Finishing time cannot be before starting time");
        }
        this.startingTime = startingTime;
        this.finishingTime = finishingTime;
    }

    public LocalTime getStartingTime() {

        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        if (startingTime.isBefore(finishingTime)) {
            throw new IllegalStateException("Starting time must be before finishing time");
        }
        this.startingTime = startingTime;
    }

    public LocalTime getFinishingTime() {
        return finishingTime;
    }

    public void setFinishingTime(LocalTime finishingTime) {
        if (finishingTime.isAfter(startingTime)) {
            throw new IllegalStateException("Finishing time is not after " + finishingTime);
        }
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
        return Objects.equals(startingTime, employee.startingTime) && Objects.equals(finishingTime, employee.finishingTime);
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
