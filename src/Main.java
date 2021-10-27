import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the player name and hit enter");
        String name=scan.next();
        Player p= new Player();
        p.setName(name);

        System.out.println("The game setup is ready");

            int diceVal;

            do {

                System.out.print("Hit enter to roll the dice ");
                 String s= scan.nextLine();
                System.out.println(s);

                Dice dice = new Dice();
                diceVal=dice.getFaceValue();
                if (diceVal == 1) {
                    System.out.println("Dice gave "+ diceVal);
                    Game _game = new Game(p);


                } else {
                    System.out.println("Dice gave "+ diceVal);
                    System.out.println("Game cannot start until you get 1");
                }
            } while(diceVal!=1);




    }
}
