package com.example.chess.Game;

import com.example.chess.Piece.Piece;

import java.util.ArrayList;
import java.util.List;

public class Player {
    Color color;
    List<Piece> figures;
    public final int PAWNS = 8;
    public final int BISHOPS = 2;
    public final int ROOKS = 2;

    private List<Piece> pieces = new ArrayList<>();

    public Player(Color color) {
        this.color = color;
    }
}
