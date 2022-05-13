public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;


    Character(){
        System.out.println("null");
    }
    //Initializing healthPoints, level, CharacterName, and mana in a parameterized constructor
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int Damage, int manadecrease, Character name) {
        /**
         * Deduct health points from enemy character
         */
        // + deduct character manapoints
        enemyCharacter.healthPoints -= Damage;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints);
        name.manaPoints = name.manaPoints - manadecrease;

        // + Level Up Character
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            name.level += 9;
            System.out.println(name.characterName + " Level up!!");

        }
    }

    //Level up Method (didn't use this, I preferred an automatic response when the enemycharacter hp fell to zero)
    public void leveup(Character name){
        name.level += 9;
        System.out.println(name.characterName+ " Level Upp");

    }

    //method on displaying current character details
    public void displaydetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");


    }

}