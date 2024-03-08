package org.utech.models;

import org.utech.strategies.WinningStrategy;

import java.util.List;

public class Game {
    Board board;

    List<Player> players;

    List<Move> moves;

    Player  nexPlayer;

    GameState gameState;

    Player wineer;

    List<WinningStrategy> winningStrategies;


    //TODO: Add builder pattern
}
