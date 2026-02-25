// This exercise covers bit manipulation
// Exercise website: https://exercism.org/tracks/java/exercises/secrets
public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    // the bitwise OR operator sets final bit to 1 if either bit
    // in the same position in the value or mask has a 1
    public static int setBits(int value, int mask) {
        return value | mask;
    }

    // the bitwise XOR operator will flip bits: 
    // 0 to 1, or 1 to 0; 0 to 0 remains 0
    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    // The bitwise AND operator with the complement of the mask clears bits
    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}