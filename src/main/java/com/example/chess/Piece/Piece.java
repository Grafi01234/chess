package com.example.chess.Piece;

import com.example.chess.Game.Player;

public abstract class Piece {
    public int m_x, m_y;
    public Player m_player;


    /**
     * Constructor for Piece
     *
     * @param x      location x of Piece
     * @param y      location y of Piece
     * @param player the Player object associated witch the Piece
     */

    public Piece(int x, int y, Player player) {
        m_x = x;
        m_y = y;
        m_player = player;

    }

    /**
     * A function that determines if their path is valid based on Piece type.
     *
     * @param finalX the final X location
     * @param finalY the final Y location
     * @return a boolean indicationg whather the path is valid
     */

    public abstract boolean isValidPath(int finalX, int finalY);
}



