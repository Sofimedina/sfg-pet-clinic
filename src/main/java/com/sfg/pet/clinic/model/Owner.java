package com.sfg.pet.clinic.model;

public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;

    public Owner(String firstName, String lastName,String address,String city,String telephone) {
        super(firstName, lastName);
        this.address=address;
        this.city=city;
        this.telephone=telephone;
    }
}
