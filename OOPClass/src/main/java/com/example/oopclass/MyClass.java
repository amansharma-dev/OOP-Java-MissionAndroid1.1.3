package com.example.oopclass;

public class MyClass {

    public static void main(String[] args) {
        Car car = new Car();
        car.companyName="BMW";
        car.carName="z4";
        car.modal=2019;
        car.price=7500000;
        System.out.println(car.companyName+" "+car.carName+" "+car.modal+" "+car.price);


        Car car1 = new Car();
        car.companyName="Mercedes";
        car.carName="e63";
        car.modal=2020;
        car.price=6500000;
        System.out.println(car.companyName+" "+car.carName+" "+car.modal+" "+car.price);

    }
}
