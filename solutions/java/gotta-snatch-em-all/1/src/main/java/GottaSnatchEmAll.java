import java.util.HashSet;
import java.util.List;
import java.util.Set;

// This exercise covers the concept of Sets
// The website for this exercise: https://exercism.org/tracks/java/exercises/gotta-snatch-em-all
class GottaSnatchEmAll {

    // create a mutable Set from a List of cards
    static Set<String> newCollection(List<String> cards) {
        Set<String> collectionSet = new HashSet<>(cards);
        return collectionSet;
    }

    // you can add a card if it doesn't already exist in the Set
    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    // you can trade cards if there are cards that exist in one collection but not the other
    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.isEmpty() && !theirCollection.isEmpty() && 
            !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    // return a set of cards that are common in all collections
    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonSet = new HashSet<>();
        // Create a set of all unique cards in all the collections
        for (Set<String> collection : collections) {
            commonSet.addAll(collection);
        }
        // then retain only those that are common in all collections
        if (!commonSet.isEmpty()) {
            for (Set<String> collection : collections) {
                commonSet.retainAll(collection);
            }
        }   
        return commonSet;
    }

    // return a set of cards all unique cards across all collections
    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> commonSet = new HashSet<>();
        // Create a set of all unique cards in all the collections
        for (Set<String> collection : collections) {
            commonSet.addAll(collection);
        }
        return commonSet;
    }
}
