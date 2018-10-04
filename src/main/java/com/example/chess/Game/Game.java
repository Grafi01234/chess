package com.example.chess.Game;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        Spot spot;

        for (int i = 0; i < 8; i++) {
            System.out.println();

            for (int j = 0; j < 8; j++) {
                spot = board.getSpot(i, j);
                spot.printSpotLocation();
            }
        }
        board.
    }
}
