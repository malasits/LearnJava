package com.sf.learn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "person") //Prefix hozzáadása, hogy melyik azonosítót figyelje az application.properties -ben
@Component
public class Person {

    @Value("${spring.profiles.active}") //Aktív profil beállítása
    private String selectedProfile;

    @Value("${msg}")
    private String message;

    private String firstName;
    private String lastName;
    private String adress;
    private int age;
    private String phoneNumber;

    //Construct
    public Person() {
    }

    //Construct
    public Person(String firstName, String lastName, String adress, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
        this.phoneNumber = phoneNumber;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSelectedProfile() {
        return selectedProfile;
    }

    public void setSelectedProfile(String selectedProfile) {
        this.selectedProfile = selectedProfile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", adress = '" + adress + '\'' +
                ", age = " + age +
                ", phoneNumber = '" + phoneNumber + '\'' +
                '}';
    }

    public String getProfileTypeAndMessage() {
        return "Person{" +
                "selectedProfile='" + selectedProfile + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
