package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Queen extends Piece {

    Type type;
    Color color;


    public Queen(int x, int y, Color color) {
        super(x, y, color);
        type = Type.QUEEN;
    }

    public Type getType() {
        return Type.QUEEN;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}
