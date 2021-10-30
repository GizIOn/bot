package com;

import com.common.gamelogic.GameLogic;
import com.common.player.Player;

public class Bot {
    private GameLogic m_gameLogic;
    private Player[] m_players;
    private int m_state;
    
    public Bot(GameLogic gameLogic){
        m_gameLogic=gameLogic;
    }

    public void start(){
        waitForPlayers();
        startGame();
        endGame();
    }

    private void waitForPlayers() {
    }

    private void startGame() {
    }

    private void endGame() {
    }
}
