package player;

public class Player {
    private String name;
    private char symbol;

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }

    public void getPlayerNameAndSymbol() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Symbol: " + this.symbol);
    }
}
