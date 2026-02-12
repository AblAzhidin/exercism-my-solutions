public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int factor = 221;
        double rate;
        if (speed < 5) {
            rate = speed * factor;
        } else if (speed < 9) {
            rate = speed * factor * 0.9;
        } else if (speed < 10) {
            rate = speed * factor * 0.8;
        } else {
            rate = speed * factor * 0.77;
        }

        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
