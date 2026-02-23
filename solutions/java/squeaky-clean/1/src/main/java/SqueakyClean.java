// This exercise covers the concept of chars and Strings
// From the exercism website: https://exercism.org/tracks/java/exercises/squeaky-clean
class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }
        
        char[] charArray = identifier.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            // If the character is a digit, we check if it's one of the leetspeak characters and replace it accordingly
            if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                    default:
                        break;
                }
            }
            // If it's a letter, we just append it to the result
            else if (Character.isLetter(ch)) {
                result.append(ch);
            // If it's a whitespace, we replace it with an underscore    
            } else if (Character.isWhitespace(ch)) {
                result.append('_');
            } else if (ch == '-') {
                // If it's a dash, we skip it and convert the next character to uppercase if it exists
                if (i + 1 < charArray.length) {
                    char nextChar = charArray[i + 1];
                    if (Character.isLetter(nextChar)) {
                        result.append(Character.toUpperCase(nextChar));
                        i++; // Skip the next character as we've already processed it
                    }
                }
            }
            // For any other character, we can choose to ignore it or handle it as needed
        }   
        return result.toString();
        // throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
    }
}
