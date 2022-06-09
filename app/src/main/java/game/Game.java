package game;

public class Game {
    String word;

    public Game( String guessWord) {
        word = guessWord;
    }
    
    public String getWordToGuess() {
        String wordToHide = this.word;
        String [] splitWord = wordToHide.split("");
        String firstLetter = splitWord[0];
        Integer blankLength = splitWord.length - 1;

        StringBuilder sb = new StringBuilder("");

        sb.append(firstLetter);

        for(int i = 0; i < blankLength; ++i) {
            sb.append("_");
        }

        return sb.toString();
    }
    
    // public static void main(String args[]) {
    //     Game game = new Game("MAKERS");
    //     System.out.println(game.word);
    // }
}
