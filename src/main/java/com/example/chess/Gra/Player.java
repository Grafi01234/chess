package com.example.chess.Gra;

import com.example.chess.Piece.Piece;

import java.util.LinkedList;
import java.util.List;

public class Player {
    Color color;
    List<Piece> bierki;

    public Player(Color color) {
        this.color = color;
        this.bierki = new LinkedList<>();
    }
}
