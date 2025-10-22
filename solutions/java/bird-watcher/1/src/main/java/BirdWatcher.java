
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] lastWeekBirdsPerDay = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeekBirdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        int upperBound = numberOfDays < birdsPerDay.length ? numberOfDays : birdsPerDay.length;
        for (int i = 0; i < upperBound; i++) {
            result += birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int result = 0;
        for (int i : birdsPerDay) {
            if (i > 4) {
                result++;
            }
        }
        return result;
    }
}
