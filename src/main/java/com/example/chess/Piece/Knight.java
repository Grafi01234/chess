package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class Knight extends Piece {

    Type type;


    public Knight(int x, int y, Player player) {
        super(x, y, player);
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