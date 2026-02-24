import java.util.HashMap;
import java.util.Map;

// This exercise covers the concept of Maps
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/international-calling-connoisseur
public class DialingCodes {
    private Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    // set the dialing code for a country
    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    // given a dialing code, get the country
    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    // Only add a new entry with new values. 
    // Do not change country for an existing key and
    // Do not add a new entry if a country already exists
    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)) {
            dialingCodes.put(code, country);
        }
    }

    // given a country, find it's dialing code
    public Integer findDialingCode(String country) {
        if (dialingCodes.containsValue(country)) {
            for (Integer key: dialingCodes.keySet()) {
                if (dialingCodes.get(key) == country) {
                    return key;
                }
            } 
        }
        return null;
    }

    // remove the entire entry if a code can be found for a country
    // then add a completely new entry for the inputted code and country
    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        if (oldCode != null) {
            // remove the old entry with the old code
            dialingCodes.remove(oldCode);
            
        }
        // add the new entry
        dialingCodes.put(code, country);
    }
}
