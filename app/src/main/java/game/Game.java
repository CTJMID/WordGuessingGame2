package game;

public class Game {
    String word;
    int turnsLeft = 10;

    public Game( String guessWord) {
        this.word = guessWord;
        
    }
    
    public String getWordToGuess() {
        String [] splitWord = this.word.split("");
        StringBuilder sb = new StringBuilder("");

        sb.append(splitWord[0]);

        for(int i = 0; i < splitWord.length - 1 ; ++i) {
            sb.append("_");
        }
        return sb.toString();
    }

    public Integer getRemainingAttempts() {
        return this.turnsLeft;
    }
    
    // public static void main(String args[]) {
    //     Game game = new Game("MAKERS");
    //     System.out.println(game.getWordToGuess());
    // }
}
