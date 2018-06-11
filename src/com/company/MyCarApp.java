package com.company;

public class MyCarApp {
    public static void main (String[]args){

        Car carOne = new Car();
        carOne.setColor("RED");
        carOne.setMake("BMW");
        carOne.setModel("X4");
        carOne.setWeight(4500);
        carOne.setYear(2017);
        carOne.setSpeed(35);

      System.out.println(carOne.start());
      System.out.println(carOne.accelerate());
      carOne.readSpeed();
      System.out.println(carOne.stop());


      System.out.println("---------------------------------");


        Car carTwo = new Car();
        carTwo.setColor("BLUE");
        carTwo.setMake("ValksWagen");
        carTwo.setModel("Jetta");
        carTwo.setWeight(4500);
        carTwo.setYear(2018);
        carTwo.setSpeed(37);

        System.out.println(carOne.start());
        System.out.println(carOne.accelerate());
        carOne.readSpeed();
        System.out.println(carOne.stop());





    }
}
