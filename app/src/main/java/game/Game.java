package game;

import java.util.Random;

public class Game {
    String word;
    int turnsLeft = 10;
    static final String[] DICTIONARY = { "MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public Game() {
        this.word = this.getRandomWordFromDictionary();
    }

    public String getWordToGuess() {
        String[] splitWord = this.word.split("");
        StringBuilder sb = new StringBuilder("");

        sb.append(splitWord[0]);

        for (int i = 0; i < splitWord.length - 1; ++i) {
            sb.append("_");
        }
        return sb.toString();
    }

    public Integer getRemainingAttempts() {
        return this.turnsLeft;
    }

    public String getRandomWordFromDictionary() {
        Random generator = new Random();
        int rnd = generator.nextInt(DICTIONARY.length);
        return DICTIONARY[rnd];
    }

    // public static void main(String args[]) {
    // Game game = new Game("MAKERS");
    // System.out.println(game.getWordToGuess());
    // }
}
