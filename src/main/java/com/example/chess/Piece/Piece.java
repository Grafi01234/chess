package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public abstract class Piece {
    private int x, y;
    private Player player;
    private boolean available;
    private Color color;

    /**
     * Constructor for Piece
     *
     * @param x      location x of Piece
     * @param y      location y of Piece
     */

    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;

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
        return x;
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

    public abstract Type getType();
}



