package com.example.oopclass;

public class Car {
    private String companyName;
    private String carName;
    private int modal;
    private int price;

    //constructor
    public Car(){

    }

    public Car(String companyName, String carName, int modal, int price) {
        this.companyName = companyName;
        this.carName = carName;
        this.modal = modal;
        this.price = price;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getModal() {
        return modal;
    }

    public void setModal(int modal) {
        this.modal = modal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //    public Car(String companyName,String carName, int modal,int price){
//
//    }


    public void turnOff(){
        System.out.println(this.carName+" Turn Off");
    }

    public void turnOn(){
        System.out.println(this.carName+" Turn On");
    }

    public void gearMode(){
        System.out.println(this.carName+" Neutral");
    }

    public String carDescription(){
        return "Company Name is " +this.companyName + " & the car name is " +this.carName+
                " of modal " +this.modal+ ", with the price of "+this.price;
    }
}
