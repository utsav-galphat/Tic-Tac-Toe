package org.utech.models;

public class Player {
    private String playerName;

    private char Symbol;

    private int id;

    private PlayerType playerType;

    public Player(String name, char symbol, int id) {
        this.setPlayerName(name);
        this.setSymbol(symbol);
        this.setId(id);
        this.setPlayerType(PlayerType.HUMAN);
    }

    public void makeMove(Board  board){

    }
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getSymbol() {
        return Symbol;
    }

    public void setSymbol(char symbol) {
        Symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
