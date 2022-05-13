public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    //Warlock Skills method class
    //Warlock skill no.1 with damage and mana reduction upon cast
    public void Echoslam(Character enemyCharacter, Character name){
        int Damage = 38;
        int manadecrease = 28;
        System.out.println(super.characterName + " Casts Echoslam (28 Mana) " + enemyCharacter.characterName + " Damage done(38hp)");
        damageTarget(enemyCharacter,Damage,manadecrease,name);
    }

    //Warlock Skill no. 2 Self-heal(Health Points Increase)
    public void healingorb() {
        super.healthPoints += 50;
        System.out.println(super.characterName+" Health restored + 50hp");
    }

    //Warlock skill no.3 with damage and mana reduction upon cast
    public void Rapture(Character enemyCharacter,Character name){
        int Damage = 36;
        int manadecrease = 25;
        System.out.println(super.characterName + " Casts Rapture (25 Mana) " + enemyCharacter.characterName + " Damage done(36hp)");
        damageTarget(enemyCharacter,Damage,manadecrease,name);
    }
}