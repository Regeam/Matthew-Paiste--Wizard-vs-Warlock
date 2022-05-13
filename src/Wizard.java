public class Wizard extends Character{
    //Wizard constructor inherits character class
    Wizard(String name, int lvl, int hp, int mana){
        super(name,lvl,hp,mana);
    }
    //Wizard Skills method class
    //Wizard skill no.1 with damage and mana reduction upon cast
    public void Meepo(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Meepo (Damage - 50)");
        int Damage = 50;
        int manadecrease = 35;
        damageTarget(enemyCharacter,Damage,manadecrease,name);
    }

    //Wizard skill no.2 Self-heal(Health Points Increase)
    public void healingpool(){
        super.healthPoints += 50;
        System.out.println(super.characterName + " Health restored + 50hp");
    }
    //Wizard skill no.3 with damage and mana reduction upon cast
    public void Kael(Character enemyCharacter, Character name){
        int Damage = 40;
        int manadecrease = 30;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Kael (Damage - 40)");
        damageTarget(enemyCharacter,Damage,manadecrease,name);
    }
}