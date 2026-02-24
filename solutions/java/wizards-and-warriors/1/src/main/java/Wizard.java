// This exercise demonstrates the concept of Inheritance
// The website for this exercise is at: https://exercism.org/tracks/java/exercises/wizards-and-warriors
class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        int damagePoints = 6;
        if (fighter.isVulnerable()) {
            damagePoints = 10;
        }
        return damagePoints;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
    
    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        // Wizard is not vulnerable if a spell was prepared in advance
        return !spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        // Wizard can inflict more damage if spell prepared in advance
        int damagePoints = 3;
        if (spellPrepared) {
            damagePoints = 12;
            // once damage is inflicted, reset spellPrepared
            spellPrepared = false;
        }
        return damagePoints;
    }
}
