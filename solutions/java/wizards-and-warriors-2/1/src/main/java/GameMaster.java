// This exercise covers the concept of Method Overloading
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/wizards-and-warriors-2
public class GameMaster {
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + 
                character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + 
            ", which has " + destination.getInhabitants()  + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        StringBuffer travelDescription = new StringBuffer("You're traveling to your destination ");
        
        switch (travelMethod) {
            case WALKING:
                travelDescription.append("by walking.");
                break;
            case HORSEBACK:
                travelDescription.append("on horseback.");
                break;
            default:
                break;
        }
        
        return travelDescription.toString();
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination); 
    }

    
    public String describe(Character character, Destination destination) {
        return describe(character, destination, TravelMethod.WALKING);
    }
}
