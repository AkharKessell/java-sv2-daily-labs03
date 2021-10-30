package Day03;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber(6);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Egy számra 1 és 100 között. Melyik?" + game.getNumber());
        for (int i = 0; i < game.getMaxGuess(); i++) {
            int guess = scanner.nextInt();
            String result = game.makeAGuess(guess);
            System.out.println(result);;
            if (game.isGameWon()) {
                break;
            }
        }
        if (!game.isGameWon()) {
            System.out.println("Sajnos nem találtad ki a számot.");
        }
    }
}