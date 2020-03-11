package com.example.oopclass;

public class MyClass {

    public static void main(String[] args) {
        Car car = new Car("BMW","z4",2019,7500000);
//        car.companyName="BMW";
//        car.carName="z4";
//        car.modal=2019;
//        car.price=7500000;
        car.setPrice(7900000);
        System.out.println("New Car Price: "+ car.getPrice());


        Car car1 = new Car("Mercedes","e63",2020,6500000);
//        car1.companyName="Mercedes";
//        car1.carName="e63";
//        car1.modal=2020;
//        car1.price=6500000;

        car.turnOn();
        car.turnOff();
        car.gearMode();

        car1.turnOn();
        car1.turnOff();
        car1.gearMode();

        System.out.println(car.carDescription());
        System.out.println(car1.carDescription());

        Car car2 = new Car("Mini","MiniCooper",2021,4300000);
        System.out.println(car2.carDescription());
    }
}
