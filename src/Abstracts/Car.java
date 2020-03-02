package Abstracts;

public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;
    private int horsePower;
    private int distance;

    public Car(String model, String color, int maxSpeed, int horsePower, int distance){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.distance = distance;
    }

    public abstract double fuelCalculation();

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
