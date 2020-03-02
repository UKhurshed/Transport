import Classes.BMW;
import Classes.Ledokol;

public class Main {
    public static void main(String[] args) {

        Ledokol ledokol = new Ledokol("Bladivostok", 42, 14317, 395, 59, 35,83800);
        ledokol.info();
        System.out.println("----------------------------------------------");

        BMW bmw = new BMW("M5", "Black", 280, 550, 250,"A95", 20);
        BMW.Engine engine = new BMW.Engine();
        engine.work();
        bmw.info();
    }
}
