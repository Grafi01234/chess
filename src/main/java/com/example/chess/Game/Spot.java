package com.example.chess.Game;

import com.example.chess.Piece.Piece;

public class Spot {
    private final int x;
    private final int y;
    private Piece piece;

    Spot(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void occupySpot(Piece piece) {
        //if piece already here, delete it, i. e. set it dead
        // TODO: check if piece is of different color
        if (this.piece != null)
            this.piece.setAvailable(false);
        //place piece here
        this.piece = piece;
    }

    public boolean isOccupied() {
        return piece != null;
    }

    public Piece releaseSpot() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

}