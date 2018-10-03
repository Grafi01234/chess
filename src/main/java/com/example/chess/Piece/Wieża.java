package com.example.chess.Piece;

import com.example.chess.Player;
import com.example.chess.Type;

public class Wieża extends Piece {

    Type type;

    /**
     * Konstruktor dla Wieży
     *
     * @param x      dla lokalizacji x dla Wieży
     * @param y      dla lokalizacji y dla Wieży
     * @param player dla przypisanego gracza do Wieży
     */
    public Wieża(int x, int y, Player player) {
        super(x, y, player);
        type = Type.WIEŻA;
    }

    public Type getType() {
        return Type.WIEŻA;
    }

    @Override
    public boolean isPValidPath(int finalX, int finalY) {
        return false;
    }
}
