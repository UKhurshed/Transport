package Classes;

import Abstracts.Ship;
import Interfaces.TransportInfo;

public class Mediterranean extends Ship implements TransportInfo {

    private float length;
    private float width;
    private int crew;
    private int weight;

    public Mediterranean(String model, int maxSpeed, int power, float length, float width, int crew, int weight){
        super(model, maxSpeed, power);
        this.length = length;
        this.width = width;
        this.crew = crew;
        this.weight = weight;
    }

    @Override
    public double powerPerWeight() {
        return getWeight()/getPower();
    }

    //implemented method
    @Override
    public void info() {
        System.out.println("Model: " + getModel() + "\n" + "Max Speed: " + getMaxSpeed() + "km/h" + "\n" + "Power: " + getPower() + "hp" +
                "\n" + "Length: " + getLength() + "m" + "\n" + "Width: " + getWidth() + "m" + "\n" + "Count crew: " + getCrew() +
                "\n" + "Weight: " + getWeight() + "ton" + "\n" + "Power per weight: " + powerPerWeight() + "hp/ton");
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
