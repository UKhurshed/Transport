package Classes;

import Abstracts.Car;
import Interfaces.TransportInfo;

public class Ford extends Car implements TransportInfo {

    private int countSeat;
    private double literFuel;

    public Ford(String model, String color, int maxSpeed, int horsePower, int distance, double literFuel, int typeOil){
        super(model, color, maxSpeed, horsePower, distance);
        this.countSeat = typeOil;
        this.literFuel = literFuel;
    }

    //Inner static class
    public static class Engine{
        private boolean isWorking = false;

        public void work(){
            isWorking = true;
            System.out.println("Engine started!");
        }
    }

    @Override
    public double fuelCalculation() {
        return getDistance()/getLiterFuel();
    }

    //implemented method
    @Override
    public void info() {
        System.out.println("Model is: " + getModel() + "\n" + "Color: " + getColor() + "\n" + "Max Speed: " + getMaxSpeed() + " km/h"
                + "\n" + "Horse Power: " + getHorsePower() + " hp" + "\n" + "Distance: " + getDistance() + " km" + "\n" + "Count seat: " + getCountSeat()
                + "\n" + "Fuel per distance: " + fuelCalculation() + " L/Km");
    }

    public int getCountSeat() {
        return countSeat;
    }

    public void setCountSeat(int countSeat) {
        this.countSeat = countSeat;
    }

    public double getLiterFuel() {
        return literFuel;
    }

    public void setLiterFuel(int literFuel) {
        this.literFuel = literFuel;
    }

}
