package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Rook extends Piece {

    Type type;


    public Rook(int x, int y, Color color) {
        super(x, y, color);
        type = Type.ROOK;
    }

    public Type getType() {
        return Type.ROOK;
    }

}
