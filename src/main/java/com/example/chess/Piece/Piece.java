package com.example.chess.Piece;

import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public abstract class Piece {

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }


    String getIcon(Color color, Type type) {
        if (color == Color.WHITE) {
            return type.getWhiteIcon();
        }
        if (color == Color.BLACK) {
            return type.getBlackIcon();
        } else return type.getBlackIcon();
    }
}



