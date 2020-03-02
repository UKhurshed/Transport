package Classes;

import Abstracts.Car;
import Interfaces.TransportInfo;

public class Mercedes extends Car implements TransportInfo {

    private String typeOil;
    private double literFuel;

    public Mercedes(String model, String color, int maxSpeed, int horsePower, int distance, double literFuel, String typeOil){
        super(model, color, maxSpeed, horsePower, distance);
        this.typeOil = typeOil;
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
                + "\n" + "Horse Power: " + getHorsePower() + " hp" + "\n" + "Distance: " + getDistance() + " km" + "\n" + "Type Oil: " + getTypeOil()
                + "\n" + "Fuel per distance: " + fuelCalculation() + " L/Km");
    }

    public String getTypeOil() {
        return typeOil;
    }

    public void setTypeOil(String typeOil) {
        this.typeOil = typeOil;
    }

    public double getLiterFuel() {
        return literFuel;
    }

    public void setLiterFuel(int literFuel) {
        this.literFuel = literFuel;
    }

}
