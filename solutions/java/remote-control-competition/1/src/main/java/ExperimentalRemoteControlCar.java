public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceTravelled = 0;
    int numberOfVictories = 0;

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.drive() method");
        distanceTravelled += 20;
    }

    public int getDistanceTravelled() {
        // throw new UnsupportedOperationException("Please implement the ExperimentalRemoteControlCar.getDistanceTravelled() method");
        return distanceTravelled;
    }
}
