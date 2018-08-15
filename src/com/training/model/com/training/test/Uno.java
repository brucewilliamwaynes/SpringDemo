package com.training.model.com.training.test;

public class Uno {

    Dos b;
    Uno(){

        System.out.println("Uno is created");

    }

    public Dos getB() {

        return b;

    }

    public void setB(Dos b) {

        this.b = b;

    }

    public void print(){

        System.out.println("hello Uno");

    }

     public void display(){

        print();

        b.print();

    }


}
