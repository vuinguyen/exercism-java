public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberLayers) {
        int timeToPrepare = 2;
        return timeToPrepare * numberLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberLayer, int actualMinutes) {
        return preparationTimeInMinutes(numberLayer) + actualMinutes;
    }
}
