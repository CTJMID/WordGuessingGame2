package game;

public class Game {
    String word;

    public Game( String guessWord) {
        word = guessWord;
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
    
    // public static void main(String args[]) {
    //     Game game = new Game("MAKERS");
    //     System.out.println(game.getWordToGuess());
    // }
}
