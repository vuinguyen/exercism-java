// This exercise covers the concept of Class Constructors
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/need-for-speed
class NeedForSpeed {
    // speed and battery drain of the car
    private int speed = 0;
    private int batteryDrain = 0;
    private int distanceDriven = 0;
    private int batteryPercentage = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven = distanceDriven + speed;
            batteryPercentage = (batteryPercentage > 0) ? (batteryPercentage - batteryDrain) : 0;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    // distance of the track
    private int distance = 0;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    // Returns true if the car can finish the race based on its speed and battery drain, false otherwise
    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        int distanceDriven = car.distanceDriven();
        return distanceDriven >= this.distance;
    }
}
