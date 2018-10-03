package com.example.chess.Piece;

import com.example.chess.Player;
import com.example.chess.Type;

public class Pionek extends Piece {

    Type type;

    /**
     * Konstruktor dla Pionka
     *
     * @param x      dla lokalizacji x dla Pionka
     * @param y      dla lokalizacji y dla Pionka
     * @param player dla przypisanego gracza do Pionka
     */
    public Pionek(int x, int y, Player player) {
        super(x, y, player);
        type = Type.PIONEK;
    }

    public Type getType() {
        return Type.PIONEK;
    }

    @Override
    public boolean isPValidPath(int finalX, int finalY) {
        return false;
    }
}