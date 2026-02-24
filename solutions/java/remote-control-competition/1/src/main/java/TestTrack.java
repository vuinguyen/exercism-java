import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    // return a list of the cars sorted by number of victories, in descending order
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        cars.sort((car1, car2) -> car2.getNumberOfVictories() - car1.getNumberOfVictories());
        return cars;
    }
}
