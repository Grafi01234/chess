package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class King extends Piece {

    Type type;

    public King(int x, int y, Player player) {
        super(x, y, player);
        type = Type.KING;
    }

    public Type getType() {
        return Type.KING;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}