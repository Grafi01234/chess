package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Knight extends Piece {

    Type type;


    public Knight(int x, int y, Color color) {
        super(x, y, color);
        type = Type.KNIGHT;
    }

    public Type getType() {
        return Type.KNIGHT;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}