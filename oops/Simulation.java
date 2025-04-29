public class Simulation {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.tune();
        g.play();
        g.repair();
    }

}

interface Playable {
    void play();
}

abstract class Instrument implements Playable {
    public void tune() {
        System.out.println("Instrument is being tuned.");
    }

    abstract void repair();
}

final class Guitar extends Instrument {
    public void play() {
        System.out.println("Guitar is playing music.");
    }

    void repair() {
        System.out.println("Repairing the Guitar.");
    }
}

/*
 * class ElectricGuitar extends Guitar {
 * //error: cannot inherit from final Guitar
 * 
 * }
 */