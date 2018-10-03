package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class Rook extends Piece {

    Type type;


    public Rook(int x, int y, Player player) {
        super(x, y, player);
        type = Type.ROOK;
    }

    public Type getType() {
        return Type.ROOK;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}
