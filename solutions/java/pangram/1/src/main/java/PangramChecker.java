import java.util.Set;

// this exercise is a pangram checker, which checks to see if a sentence
// contains every letter of the alphabet
// website: https://exercism.org/tracks/java/exercises/pangram
public class PangramChecker {

    public boolean isPangram(String input) {  
        if (input == "") {
            return false;
        }    
        // set the sentence to lower case
        // and remove every character that is not an alphabet letter
        char[] charInput = input.toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();

        Set<Character> alphabetSet = new java.util.HashSet<>();
        // create a set of characters from the alphabet
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }
        // remove characters from the alphabet set that are present in the input
        for (char c : charInput) {
            alphabetSet.remove(c);
        }
        // if the set is empty, then all alphabet characters were present in the input
        return alphabetSet.isEmpty();
    }

}
