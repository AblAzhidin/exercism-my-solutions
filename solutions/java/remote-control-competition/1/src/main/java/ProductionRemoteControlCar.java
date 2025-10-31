class ProductionRemoteControlCar implements RemoteControlCar,
        Comparable<ProductionRemoteControlCar> {

    private int drivenDistance = 0;
    private int numberOfVictories;

    public void drive() {
        drivenDistance += 10;
    }

    public int getDistanceTravelled() {
        return drivenDistance;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return car.getNumberOfVictories() - this.numberOfVictories;
    }
}
