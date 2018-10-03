package com.example.chess.Piece;

import com.example.chess.Game.Player;

public abstract class Piece {
    public int m_x, m_y;
    public Player m_player;
    private boolean available;

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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getX() {
        return m_x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



