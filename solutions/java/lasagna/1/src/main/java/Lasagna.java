public class Lasagna {
    private static final int expectedMinutesInOven = 40;
    private static final int minutesPerLayer = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven - minutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layerNum) {
        return layerNum * minutesPerLayer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layerNum, int minutesInOven) {
        return preparationTimeInMinutes(layerNum) + minutesInOven;
    }
}
