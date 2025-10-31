public class ExperimentalRemoteControlCar implements RemoteControlCar {

    private int drivenDistance = 0;
    
    public void drive() {
        drivenDistance += 20;
    }

    public int getDistanceTravelled() {
        return drivenDistance;
    }
}
