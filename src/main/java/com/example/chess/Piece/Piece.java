package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public abstract class Piece {
    private Player player;
    private boolean available;
    private Color color;

    /**
     * Constructor for Piece
     * @param color color of the piece
     */

    public Piece(Color color) {
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

    public abstract Type getType();

}



