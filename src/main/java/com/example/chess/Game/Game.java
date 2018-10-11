package com.example.chess.Game;

import com.example.chess.Piece.Piece;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Piece[][] plansza = board.getBoard();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println(plansza[i][j]);
            }
        }


//        Type pionek = Type.PAWN;
//        System.out.println(pionek.getIcon(Color.WHITE));
    }
}
