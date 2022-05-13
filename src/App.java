public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");

        //Wizard and Warlock
        Wizard Character1 = new Wizard("Player1", 1, 100, 150);
        Warlock Character2 = new Warlock("Player2",1,100,150);

        //character actions sequence
        //1 skill required per round
        System.out.print("\n");
        //Displaying Character name and details
        Character1.displayName();
        Character1.displaydetails();
        Character2.displayName();
        Character2.displaydetails();

        //1st round
        System.out.println("\n~~~~~~~~~");
        System.out.println("Let The Game Begin!\n");
        System.out.println("1st round\n");
        //skill casts
        Character1.Meepo(Character2,Character1);
        Character2.Echoslam(Character1,Character2);
        //Character details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //2nd round
        System.out.println("2nd Round\n");
        //skill casts
        Character2.Rapture(Character1,Character2);
        Character1.Kael(Character2,Character1);
        //Character Details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //3rd round
        System.out.println("3rd Round\n");
        //skill casts
        Character1.healingpool();
        Character2.Echoslam(Character1,Character2);
        //Character Details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();

        //4th round
        System.out.println("4th Round\n");
        ///casting skill
        Character2.Rapture(Character1,Character2);
        Character1.Meepo(Character2,Character1);
        //Character Details
        System.out.print("\n");
        Character1.displaydetails();
        Character2.displaydetails();


    }
}