

----------------------GearBox.java----------------------

import java.util.ArrayList;

/**
 * GearBox
 */

public class GearBox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear=0;

    public GearBox(int maxGears){
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();

        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs* (this.ratio);
        }

    }

}

-----------------------Main.java---------------------------------

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1,12.3);

        // GearBox.Gear second = new Gearbox.Gear(2,13.4);
        // GearBox.Gear third = new mcLaren.Gear(3,17.8);


        System.out.println(first.driveSpeed(1000));


    }
}
