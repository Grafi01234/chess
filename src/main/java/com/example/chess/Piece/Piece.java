package com.example.chess.Piece;


import com.example.chess.Game.Color;
import com.example.chess.Game.Type;

public class Piece {
    private int x;
    private int y;
    private Color color;

    public Piece(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    String getIcon(Type type, Color color) {
        return type.getIcon(color);
    }
}



