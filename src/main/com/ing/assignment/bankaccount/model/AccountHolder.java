package com.ing.assignment.bankaccount.model;

import java.time.LocalDate;

public class AccountHolder {

    private String nationalIdNumber;
    private String firstName;
    private String lastName;
    private String houseNo;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private LocalDate dateOfBirth;
    private String gender;
    private String phoneNumber;
    private LocalDate joinedDate;

    public AccountHolder(String nationalIdNumber, String firstName, String lastName,
                         String houseNo, String streetAddress1, String streetAddress2, String city, String state,
                         String country, LocalDate dateOfBirth, String gender, String phoneNumber, LocalDate joinedDate) {
        this.nationalIdNumber = nationalIdNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseNo = houseNo;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.joinedDate = joinedDate;
    }


    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(String nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate;
    }
}
