package org.utech.models;

import org.utech.strategies.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultLeve botDifficultLeve;
    private BotPlayingStrategy botPlayingStrategy;

    public BotDifficultLeve getBotDifficultLeve() {
        return botDifficultLeve;
    }

    public void setBotDifficultLeve(BotDifficultLeve botDifficultLeve) {
        this.botDifficultLeve = botDifficultLeve;
    }

    public Bot(String name, char symbol, int id, BotDifficultLeve botDifficultLeve, BotPlayingStrategy botPlayingStrategy) {
        super(name, symbol, id);
        this.setPlayerType(PlayerType.BOT);
        this.setBotDifficultLeve(botDifficultLeve);
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
