package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class King extends Piece {

    Type type;

    public King(int x, int y, Color color) {
        super(x, y);
        type = Type.KING;
    }

}
