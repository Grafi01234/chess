package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class Queen extends Piece {

    Type type;

    public Queen(int x, int y, Player player) {
        super(x, y, player);
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
