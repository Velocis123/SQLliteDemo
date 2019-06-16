package com.akash.sqllitedemo.Model;

public class Details {

    private String roll;
    private String name;
    private String gender;



    public Details(String roll, String name, String gender) {
        this.roll = roll;
        this.name = name;
        this.gender = gender;

    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
