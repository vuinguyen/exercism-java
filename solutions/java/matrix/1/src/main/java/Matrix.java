import java.util.ArrayList;

// Given a string representing a matrix of numbers, return the rows and columns of that matrix.
// Website: https://exercism.org/tracks/java/exercises/matrix
class Matrix {

    private String matrixAsString = "";

    Matrix(String matrixAsString) {
        this.matrixAsString = matrixAsString;
    }

    int[] getRow(int rowNumber) {
        if (matrixAsString.length() == 1) {
            // convert matrixAsString to int[]
            return matrixAsString.chars().map(Character::getNumericValue).toArray();
        }

        // Break the matrixAsString into rows, then get the row we want, and convert it to int[]
        String[] matrixArraysAsString = matrixAsString.split("\n");
        char[] matrixChars = matrixArraysAsString[rowNumber - 1].toCharArray();
        ArrayList<Integer> matrixInts = new ArrayList<Integer>();
        // iterate through the chars and convert them to ints, ignoring whitespace
        // if two chars are next to each other, they will be converted to a single int (e.g. "12" will be converted to 12)
        for (int i = 0; i < matrixChars.length; i++) {
            char matrixChar = matrixChars[i];
            if (!Character.isWhitespace(matrixChar)) {
                // If the current character is a digit and the next character is also a digit, combine them
                if (i + 1 < matrixChars.length && Character.isDigit(matrixChars[i + 1])) {
                    int combinedValue = Character.getNumericValue(matrixChar) * 10 + Character.getNumericValue(matrixChars[i + 1]);
                    matrixInts.add(combinedValue);
                    i++; // Skip the next character since it's already processed
                } else {
                    matrixInts.add(Character.getNumericValue(matrixChar));
                }   
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] matrixRow = new int[matrixInts.size()];
        for (int i = 0; i < matrixInts.size(); i++) {
            matrixRow[i] = matrixInts.get(i);
        }
        return matrixRow;
    }

    // Given a column number, return the column as an int[]
    int[] getColumn(int columnNumber) {
        String[] matrixArraysAsString = matrixAsString.split("\n");
        int[] column = new int[matrixArraysAsString.length];
        for (int i = 0; i < matrixArraysAsString.length; i++) {
            String[] row = matrixArraysAsString[i].split("\\s+");
            column[i] = Integer.parseInt(row[columnNumber - 1]);
        }
        return column;
    }
}
