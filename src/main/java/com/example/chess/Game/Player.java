package com.example.chess.Game;

import com.example.chess.Piece.Piece;

import java.util.LinkedList;
import java.util.List;

public class Player {
    Color color;
    List<Piece> figures;

    public Player(Color color) {
        this.color = color;
        this.figures = new LinkedList<>();
    }
}
