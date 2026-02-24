import java.util.Scanner;
import java.util.Random;
void main() {

    Scanner in = new Scanner(System.in);
    Random generator = new Random();
    String keepRolling;

    do {
        int Dice1 = generator.nextInt(6) + 1;
        int Dice2 = generator.nextInt(6) + 1;
        int sum = Dice1 + Dice2;

        System.out.println("Dice1: " + Dice1);
        System.out.println("Dice2: " + Dice2);
        System.out.println("Sum: " + sum);

        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("Craps! You lose.");
        } else if (sum == 7 || sum == 11){
            System.out.println("Natural, You win!");

        }else {
            int point = sum;
            System.out.println("Points is now: "+ point);

            boolean rolling = true;

            while (rolling) {

                Dice1 = generator.nextInt(6) + 1;
                Dice2 = generator.nextInt(6) + 1;
                sum = Dice1 + Dice2;

                System.out.println("Dice1: " + Dice1);
                System.out.println("Dice2: " + Dice2);
                System.out.println("Sum: " + sum);

                if (sum == point) {
                    System.out.println("Made point and won!");
                    rolling = false;
                }
                else if (sum == 7) {
                    System.out.println("Got a seven and lost!");
                    rolling = false;
                }
                else {
                    System.out.println("Trying for point...");
                }
            }

        }
        System.out.println("Play again (Y/N)?: ");
        keepRolling = in.next();
    } while (keepRolling.equalsIgnoreCase("y"));
}
