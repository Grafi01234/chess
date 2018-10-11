package com.example.chess.Piece;

import com.example.chess.Game.Type;

public class Empty extends Piece {

    Type type;

    public Empty(int x, int y) {
        super(x, y);
        type = Type.EMPTY;
    }

}
