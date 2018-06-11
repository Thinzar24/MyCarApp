package com.company;

public class Car extends Vehicle{

    private String color;
    private String make;
    private String model;
    private int year;
    private int weight;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String start() {
        return year+" " +model+ " " + make + super.start();
    }

    @Override
    public String accelerate() {
        return year+" "+model+" "+ make +super.accelerate();
    }

    @Override
    public void readSpeed() {
        super.readSpeed();
    }

    @Override
    public String stop() {
        return year+" "+model+ " "+ make + super.stop();
    }


}

