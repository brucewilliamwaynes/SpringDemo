package com.training.model;

public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(){

        System.out.println("Default");

    }

    /*
    public Employee(int id) {

        this.id = id;

    }
    */

    public Employee(int id, String name) {

        super();

        this.id = id;

        this.name = name;

    }


    public Employee(int id, String name, Address address) {

        super();

        this.id = id;

        this.name = name;

        this.address = address;

    }

    public void show(){

        System.out.println( "Hi " + name);

        System.out.println( "Your id :" + id);

        System.out.println(address.toString());

    }

}