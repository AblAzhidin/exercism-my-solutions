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
        return fighter.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    
    boolean preparedSpell = false;
    
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return preparedSpell ? false : true;
    }
    
    void prepareSpell() {
        preparedSpell = true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return preparedSpell ? 12 : 3; 
    }
}
