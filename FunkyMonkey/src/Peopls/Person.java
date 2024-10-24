package Peopls;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public Person(String firstname, String lastname, int year, int month, int day){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = LocalDate.of(year, month, day);
        totalPeople++;
    }

    private static int totalPeople = 0;
    private String firstname;
    private String lastname;

    private LocalDate dateOfBirth;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstName(String newFirstname){
        firstname = newFirstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateOfBirth() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return dateOfBirth.format(myFormatObj);
    }

    public void setDateOfBirth(int year, int month, int day) {
        this.dateOfBirth = LocalDate.of(year, month, day);
    }

    public static int getTotalPeople() {
        return totalPeople;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}


