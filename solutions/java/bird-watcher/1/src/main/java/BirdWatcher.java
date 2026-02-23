
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        int todaysCount = birdsPerDay[birdsPerDay.length - 1];
        birdsPerDay[birdsPerDay.length - 1] = todaysCount + 1;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int totalDays = (numberOfDays <= birdsPerDay.length) ? numberOfDays : birdsPerDay.length;
        for (int i = 0; i < totalDays; i++) {
            count = count + birdsPerDay[i];
        }
        return count;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int count = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                count = count + 1;
            }
        }
        return count;
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
