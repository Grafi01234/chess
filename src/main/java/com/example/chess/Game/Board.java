package com.example.chess.Game;

import com.example.chess.Piece.Piece;

class Board {
    private Piece[][] pieces = new Piece[8][8];

    Board() {
        super();
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                this.pieces[i][j] = new Piece(i, j, Color.EMPTY);
                {
                }
            }
        }
    }

//    Spot getSpot(int x, int y) {
//        return pieces[x][y];
//    }

    void printBoard() {
        Piece piece;
        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++) {
                Piece test = pieces[i][j];
                System.out.print(test.getIcon(Type.EMPTY, Color.EMPTY) + " ");


            }
        }
    }

}