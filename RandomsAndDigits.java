import java.util.Scanner;

/**
 * AP / IB Computer Science  .  Unit 2
 *
 * Six problems in two sets.
 *   Set A - the Math class.No input; the program does the choosing.
 *   Set B - integer division and modulus, with a Scanner.
 *
 * All six are straight-line programs. No if statements. No loops.
 *
 * Do one from SET A and one from SET B, or all of them if you can. Delete the ones you do not attempt, or leave them.
 *
 * @author Kaden Gurnee
 */
public class RandomsAndDigits {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // ========== SET A - the Math class ==============================

        // ----- 1. Two Dice and a Character Sheet -------------------------
        // Roll two six-sided dice. Print each one and the total.
        // Then roll four ability scores. An ability score is THREE six-sided
        // dice added together, so it lands somewhere from 3 to 18.
        //
        // Hint: one die is a random integer from 1 to 6.
        //       range = max - min + 1.  Roll the three dice separately.
        int a6 = (int)(Math.random() * 6) + 1;
        int b6 = (int)(Math.random() * 6) + 1;
        System.out.println("Die 1: " + a6 + "\nDie 2: " + b6 + "\nTotal: " + (a6+b6));

        int c6 = (int)(Math.random() * 6) + 1;
        int d6 = (int)(Math.random() * 6) + 1;
        int e6 = (int)(Math.random() * 6) + 1;
        System.out.println("Ability score: " + (c6+d6+e6));
        // ----- 2. Random Color Chip --------------------------------------
        // Three random values from 0 to 255 - red, green, blue.
        // Print the three values, then  rgb(r, g, b), then the grey value,
        // which is the average of the three.
        //
        // Hint: 0 to 255 inclusive is 256 values, not 255.
        //       The average of three ints is an int. That is fine here.


        // ----- 3. Random License Plate  (the hard one) -------------------
        // Three random capital letters, a space, three random digits:
        //   GOQ 127
        //
        // In Unicode 'A' is 65 and 'Z' is 90 - the numbering from Unit 1.
        // Make a random int from 0 to 25, add 65, cast the result to a char:
        //
        //   char letter = (char)((int)(Math.random() * 26) + 65);
        //
        // Watch what happens when you print three chars added together.


        // ========== SET B - digits and money ============================

        // ----- 4. Digit Split --------------------------------------------
        // Read a four-digit number. Print its digits one at a time, then
        // what they add up to.
        //   5087  ->  5 - 0 - 8 - 7        The digits add up to 20.
        //
        // Hint: you know how to get the last digit. The second-to-last is
        //       the same move, after dividing the number down by 10 first.

        System.out.println("Number: ");
        int number = keyboard.nextInt();
        int d1 = number % 10;
        int d2 = number / 10 % 10;
        int d3 = number / 100 % 10;
        int d4 = number / 1000 % 10;
        System.out.println(number + "  ->  " + d4 + " - " + d3 + " - " + d2 + " - " + d1);
        System.out.println("The digits add up to " + (d4+d3+d2+d1));


        // ----- 6. Split the Check  (the other hard one) ------------------
        // Read a bill (a double) and a number of people (an int). Split it
        // evenly to the cent and report the pennies left over.
        //   87.35 split 4 ways -> 8735 cents, 2183 each, 3 cents left over
        //
        // Work in whole cents from the start:
        //
        //   int totalCents = (int)(bill * 100 + 0.5);
        //
        // The + 0.5 is not decoration. Try 40.12 with it and without it -
        // 40.12 * 100 is 4011.9999999999995 in a double, and the cast throws
        // the rest away. That is round-off error in real money.

    }
}
