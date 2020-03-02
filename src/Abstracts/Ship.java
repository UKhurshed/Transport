package Abstracts;

public abstract class Ship {

    private String model;
    private int maxSpeed;
    private int power;

    public Ship(String model, int maxSpeed, int power){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.power = power;
    }

    public abstract double powerPerWeight();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
