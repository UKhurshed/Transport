package Classes;

import Abstracts.Airplane;
import Interfaces.TransportInfo;

public class Mig extends Airplane implements TransportInfo {

    private int length;
    private int height;
    private double distanceFlight;

    public Mig(String model, String color, int maxSpeed, int length, int height, double distanceFlight){
        super(model, color, maxSpeed);
        this.length = length;
        this.height = height;
        this.distanceFlight = distanceFlight;
    }

    @Override
    public double flightTime() {
        return getDistanceFlight()/getMaxSpeed();
    }

    //implemented method
    @Override
    public void info() {
        System.out.println("Model: " + getModel() + "\n" + "Color: " + getColor() + "\n" + "Max Speed" + getMaxSpeed() + " km/h" + "\n"
                + "\n" + "Length: " + getLength() + " m" + "\n" + "Height: " + getHeight() + " m" + "\n" + "Distance flight: " + getDistanceFlight() + " km" +
                "\n" + "Flight time: " + flightTime() + " h");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getDistanceFlight() {
        return distanceFlight;
    }

    public void setDistanceFlight(double distanceFlight) {
        this.distanceFlight = distanceFlight;
    }

}
