package com.example.chess.Game;

import com.example.chess.Piece.Piece;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Spot spot;
        Player player1 = new Player(Color.WHITE);
        player1.initializePieces();

        Player player2 = new Player(Color.BLACK);
        player2.initializePieces();

        for (int i = 0; i < 8; i++) {
            System.out.println();

            for (int j = 0; j < 8; j++) {
                spot = board.getSpot(i, j);
                spot.printSpotLocation();
            }
        }
            spot = board.getSpot(0,0);
       List<Piece> BlackPieces = player2.getPieces();
       //Jak zastawic plansze pionkami - Spot occupy (Piece piece) konkretny spot konkretna figura z listy gracza
        BlackPieces.get()
    }
}
