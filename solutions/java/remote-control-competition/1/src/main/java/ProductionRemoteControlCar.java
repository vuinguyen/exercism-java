class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distanceTravelled = 0;
    int numberOfVictories = 0;
    public void drive() {
        // throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.drive() method");
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        // throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getDistanceTravelled() method");
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        //throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        if (this.numberOfVictories != other.numberOfVictories) {
            return Integer.compare(other.numberOfVictories, this.numberOfVictories);
        }
        return Integer.compare(other.distanceTravelled, this.distanceTravelled);
    }
}
