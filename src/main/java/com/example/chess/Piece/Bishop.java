package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Bishop extends Piece {

    Type type;

    public Bishop(int x, int y, Color color) {
        super(x, y, color);
        type = Type.BISHOP;
    }

    public Type getType() {
        return Type.BISHOP;
    }

}
