public class Lasagna {
    private static final int expectedMinutesInOven = 40;
    private static final int minutesPerLayer = 2;
    
    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layerNum) {
        return layerNum * minutesPerLayer;
    }

    public int totalTimeInMinutes(int layerNum, int minutesInOven) {
        return preparationTimeInMinutes(layerNum) + minutesInOven;
    }
}
