// This exercise covers the concepts of if-else statements and Numbers
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/cars-assemble
public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double baseProductionRate = 221.0;
        if (speed >= 1 && speed <= 4) {
            return baseProductionRate * speed;
        } else if (speed >= 5 && speed <= 8) {
            return baseProductionRate * speed * 0.9;
        } else if (speed == 9) {
            return baseProductionRate * speed * 0.8;
        } else if (speed == 10) {
            return baseProductionRate * speed * 0.77;
        } else {
            return 0.0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double itemsPerHour = productionRatePerHour(speed);
        return (int) (itemsPerHour / 60);
    }
}
