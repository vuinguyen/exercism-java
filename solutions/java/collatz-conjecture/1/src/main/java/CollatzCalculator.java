// This exercise implements the Collatz conjecture, 
// which states that if you take any positive integer n and apply the following rules, 
// you will eventually end up with 1:
// - If n is even, divide it by 2 to get n / 2.
// - If n is odd, multiply it by 3 and add 1 to get 3n + 1.
// The conjecture is that no matter what positive integer you start with, you will always eventually reach 1. 
// The number of steps it takes to reach 1 is called the "Collatz step count" for that integer. 
// Website for algorithm exercise: https://exercism.org/tracks/java/exercises/collatz-conjecture
class CollatzCalculator {
    private int stepCount = 0;

    int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        } 

        if (start == 1) {
            return stepCount;
        }

        while (start != 1) {
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = (start * 3) + 1;
            }
            stepCount = stepCount + 1;
        }

        return stepCount;
    }
}
