class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // can only execute a fast attack if the knight is sleeping
        return !knightIsAwake;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // can spy if at least one of them is awake
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // can signal the prisoner if the archer is sleeping and the prisoner is awake
        return !archerIsAwake && prisonerIsAwake;
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // can free the prisoner if the dog is present and the archer is sleeping, 
        // or if the dog is not present and the knight and archer are sleeping and the prisoner is awake
        if (petDogIsPresent == true) {
            return !archerIsAwake;
        } else {
            return !knightIsAwake && !archerIsAwake && prisonerIsAwake;
        }
    }
}
