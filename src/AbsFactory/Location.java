package AbsFactory;

import java.util.Random;

public enum Location {
    DEFAULT, USA, ASIA;

    public static Location generateRandomLocation() {
        Location[] values = Location.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }
}