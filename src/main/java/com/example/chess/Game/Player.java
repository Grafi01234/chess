package com.example.chess.Game;

import com.example.chess.Piece.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public final int KNIGHT = 2;
    public final int KING = 1;
    public final int BISHOPS = 2;
    public final int ROOKS = 2;
    public final int QUEEN = 1;
    private final int PAWNS = 8;
    private Color color;

    private List<Piece> pieces = new ArrayList<>();

    public Player(Color color) {
        this.color = color;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void initializePieces() {
        if (color == Color.BLACK) {
            for (int i = 0; i < PAWNS; i++) { // draw pawns
                pieces.add(new Pawn(1, i, color));
            }
            pieces.add(new Rook(0, 7, color));
            pieces.add(new Rook(0, 0, color));
            pieces.add(new Bishop(0, 2, color));
            pieces.add(new Bishop(0, 5, color));
            pieces.add(new Knight(0, 1, color));
            pieces.add(new Knight(0, 6, color));
            pieces.add(new Queen(0, 4, color));
            pieces.add(new King(0, 3, color));
        } else {
            for (int i = 0; i < PAWNS; i++) { // draw pawns
                pieces.add(new Pawn(6, i, color));
            }
            pieces.add(new Rook(7, 0, color));
            pieces.add(new Rook(7, 7, color));
            pieces.add(new Bishop(7, 2, color));
            pieces.add(new Bishop(7, 5, color));
            pieces.add(new Knight(7, 1, color));
            pieces.add(new Knight(7, 6, color));
            pieces.add(new Queen(7, 4, color));
            pieces.add(new King(7, 3, color));
        }

    }
}
