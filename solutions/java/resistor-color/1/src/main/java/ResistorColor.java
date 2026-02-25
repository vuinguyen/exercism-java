// This exercise prints the code for resistor colors
// website: https://exercism.org/tracks/java/exercises/resistor-color
class ResistorColor {
    // map the colors in the array such that the array index becomes the colorCode for the
    // color's String value
    private String[] colorCodes = {"black", "brown", "red", "orange", "yellow", 
                                    "green", "blue", "violet", "grey", "white"};
    int colorCode(String color) {
        int colorCode = -1;
        
        for (int i = 0; i < colorCodes.length; i++) {
            if (colorCodes[i].equals(color)) {
                colorCode = i;
                break;
            }
        }
        return colorCode;
    }

    String[] colors() {
        return colorCodes;
    }
}
