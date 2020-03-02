package Classes;

import Abstracts.Airplane;
import Interfaces.TransportInfo;

public class Boeing extends Airplane implements TransportInfo {

    private int countSeat;
    private double distanceFlight;

    Boeing(String model, String color, int maxSpeed, int countSeat, double distanceFlight){
        super(model, color, maxSpeed);
        this.countSeat = countSeat;
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
                + "Count seat: " + getCountSeat() + "\n" + "Distance flight: " + getDistanceFlight() + " km" + "\n" + "Flight time: " + flightTime() + " h");
    }

    public int getCountSeat() {
        return countSeat;
    }

    public void setCountSeat(int countSeat) {
        this.countSeat = countSeat;
    }

    public double getDistanceFlight() {
        return distanceFlight;
    }

    public void setDistanceFlight(double distanceFlight) {
        this.distanceFlight = distanceFlight;
    }

}
