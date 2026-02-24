// This exerise covers the concept of Classes
// The excercism link is here: https://exercism.org/tracks/java/exercises/jedliks-toy-car
public class JedliksToyCar {

    private int metersDriven = 0;
    private int batteryPercentageRemaining = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersDriven + " meters";
    }

    public String batteryDisplay() {
        String batteryStatus = batteryPercentageRemaining > 0 ? "Battery at " + batteryPercentageRemaining + "%" : "Battery empty";
        return batteryStatus;
    }

    public void drive() {
        // Each drive should increase the distance driven by 20 meters and decrease the battery percentage by 1%
        metersDriven = (metersDriven == 2000) ? 2000 : metersDriven + 20;
        batteryPercentageRemaining = (batteryPercentageRemaining > 0) ? batteryPercentageRemaining - 1 : 0;
    }
}
