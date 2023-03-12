package com.lifecycle.model;

import java.util.List;

public class User {
    public static long counter;
    private String firstname;
    private String dataOfBirth;
    private List<String> facts;

    public static long getCounter() {
        return counter;
    }

    public static void setCounter(long counter) {
        User.counter = counter;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public List<String> getFacts() {
        return facts;
    }

    public void setFacts(List<String> facts) {
        this.facts = facts;
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + firstname + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                '}';
    }
}
