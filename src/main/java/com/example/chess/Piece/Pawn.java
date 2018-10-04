package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Pawn extends Piece {

    Type type;


    public Pawn(int x, int y, Color color) {
        super(x, y, color);
        type = Type.PAWN;
    }

    public Type getType() {
        return Type.PAWN;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}