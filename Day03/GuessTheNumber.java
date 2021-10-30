package Day03;

import java.util.Random;

public class GuessTheNumber {
    private int maxGuess;
    private int Number = new Random().nextInt(1, 101);
    private boolean gameWon = false;

    public GuessTheNumber(int maxGuess) {
        this.maxGuess = maxGuess;
    }

    public int getMaxGuess() {
        return maxGuess;
    }

    public int getNumber() {
        return Number;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public String makeAGuess(int guess) {
        if (guess == Number) {
            gameWon = true;
            return "You Won";
        } else if (guess < Number) {
            return "You lost, it is bigger.";
        } else {
            return "You lost, it is smaller.";
        }
    }
}