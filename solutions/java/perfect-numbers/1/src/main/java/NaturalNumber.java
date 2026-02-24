class NaturalNumber {
    private Classification classification = Classification.DEFICIENT;

    // This exercise determines if a number is perfect, abundunt, or deficient
    // based on the Nicomachus classification scheme for positive integers
    // website: https://exercism.org/tracks/java/exercises/perfect-numbers
    NaturalNumber(int number) {
        int aliquotSum = 0;

        // if you can divide number by i and not get a remainder, 
        // then i is a factor of number
        // add the factor to the aliquotSum
        try {
            if (number < 1) {
                throw new IllegalArgumentException("You must supply a natural number (positive integer)");
            }
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    aliquotSum = aliquotSum + i;
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }

        // A number is perfect when it equals its aliquot sum
        // Example: 6: 1 + 2 + 3 = 6. 6 = 6
        if (aliquotSum == number) {
            classification = Classification.PERFECT;
        // A number is abundant when it is less than its aliquot sum
        // Example: 12: 1 + 2 + 3+ 4+ 6 = 16; 12 < 16
        } 
        else if (aliquotSum > number) {
            classification = Classification.ABUNDANT;
        }
        // A number is deficient when it is greater than its aliquot sum
        // Example: 8: 1 + 2 + 4 = 7; 8 > 7
        else {
            classification = Classification.DEFICIENT;
        }
    }

    Classification getClassification() {
        return classification;
    }
}
