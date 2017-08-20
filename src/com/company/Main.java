package com.company;

public class Main {

    public static void main(String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass();
        MyAnotherClass myAnotherClass = new MyAnotherClass();

        System.out.println( myFirstClass.toString());
        System.out.println( myAnotherClass.toString());
        MyFirstClass myFirstClass1 = myFirstClass;
        System.out.println(myFirstClass1.toString());

        myFirstClass.setNumber(10);


        System.out.println(myFirstClass == myFirstClass1);
    }
}
