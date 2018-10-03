package com.example.chess;

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
        super(x, y, Player);
        type = Type.KRÓL;
    }

    public Type getType() {
        return Type.KRÓL;
    }

    @Override
    public boolean isPValidPath(int finalX, int finalY) {

    }
}
