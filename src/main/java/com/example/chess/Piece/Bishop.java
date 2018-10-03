package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class Bishop extends Piece {

    Type type;

    public Bishop(int x, int y, Player player) {
        super(x, y, player);
        type = Type.BISHOP;
    }

    public Type getType() {
        return Type.BISHOP;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}
