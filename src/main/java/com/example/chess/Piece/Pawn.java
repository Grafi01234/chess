package com.example.chess.Piece;

import com.example.chess.Game.Player;
import com.example.chess.Game.Type;

public class Pawn extends Piece {

    Type type;


    public Pawn(int x, int y, Player player) {
        super(x, y, player);
        type = Type.PAWN;
    }

    public Type getType() {
        return Type.PAWN;
    }

    @Override
    public boolean isValidPath(int finalX, int finalY) {
        return false;
    }
}