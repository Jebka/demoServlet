package com.example.demo1;

public class Employee {
//1110001
    private int id;
    private String name;
    private String surname;
    private String email;
    private String country;
    private String phoneNumber;

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", email ='" + email + '\'' +
                ", country ='" + country + '\'' +
                ", phoneNumber ='" + phoneNumber + '\'' +
                "]\n";
    }
}
