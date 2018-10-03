package com.example.chess.Piece;

import com.example.chess.Gra.Player;
import com.example.chess.Gra.Type;

public class Goniec extends Piece {

    Type type;

    /**
     * Konstruktor dla Gońca
     *
     * @param x      dla lokalizacji x dla Gońca
     * @param y      dla lokalizacji y dla Gońca
     * @param player dla przypisanego gracza do Gońca
     */
    public Goniec(int x, int y, Player player) {
        super(x, y, player);
        type = Type.GONIEC;
    }

    public Type getType() {
        return Type.GONIEC;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}