
// This exercise implements the Armstrong number
// An Armstrong number is a number that is the sum of its own digits 
// each raised to the power of the number of digits.
// For example, 153 is an Armstrong number, because it has 3 digits, and:
//     1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// For example, 154 is not an Armstrong number, because:
//     1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 != 154
// Website: https://exercism.org/tracks/java/exercises/armstrong-numbers
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        boolean amstrongNumber = false;

        // Convert the numberToCheck into an array of characters so we can work with
        // Each digit in the number individually
        char[] charNumberArray = Integer.toString(numberToCheck).toCharArray();
        // find the number of digits in the numberToCheck
        int numberOfDigits = charNumberArray.length;

        // Perform the check for the Armstrong Number
        int sum = 0;
        for (int i = 0; i < numberOfDigits; i++) {
            int digit = Character.getNumericValue(charNumberArray[i]);
            sum += Math.pow(digit, numberOfDigits);
        }
        if (sum == numberToCheck) {
            amstrongNumber = true;
        }
        
        return amstrongNumber;
    }

}
