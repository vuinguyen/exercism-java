import java.util.Random;

// This exercise covers the concept of Randomness
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/captains-log
class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        // generates a random index between 0 and the length of PLANET_CLASSES - 1, 
        // and returns the character at that index to select a random planet class
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        // generates a number between 1000 and 9999 (inclusive)
        int registryNumber = 1000 + random.nextInt(9000); 
        return "NCC-" + registryNumber;
    }

    double randomStardate() {
        // generates a number between 41000.0 (inclusive) and 42000.0 (exclusive)
        return 41000.0 + (random.nextDouble() * 1000.0);
    }
}
