package com.example.chess.Piece;

import com.example.chess.Player;
import com.example.chess.Type;

public class Król extends Piece {

    Type type;

    /**
     * Konstruktor dla Króla
     *
     * @param x      dla lokalizacji x dla Króla
     * @param y      dla lokalizacji y dla Króla
     * @param player dla przypisanego gracza do Króla
     */
    public Król(int x, int y, Player player) {
        super(x, y, player);
        type = Type.KRÓL;
    }

    public Type getType() {
        return Type.KRÓL;
    }

    @Override
    public boolean isPValidPath(int finalX, int finalY) {
        return false;
    }
}
