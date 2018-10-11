package com.example.chess.Game;

/**
 * Pieces types are stored as constans
 */

public enum Type {
    PAWN("\u2659", "\u265F"),
    KING("\u2654", "\u265A"),
    QUEEN("\u2655", "\u265B\t"),
    KNIGHT("\u2658", "\u265E"),
    ROOK("\u2656", "\u265C"),
    BISHOP("\u2657", "\u265D"),
    EMPTY(" ", " ");

    private final String whiteIcon;
    private final String blackIcon;

    Type(String whiteIcon, String blackIcon) {
        this.whiteIcon = whiteIcon;
        this.blackIcon = blackIcon;
    }

    public String getWhiteIcon() {
        return whiteIcon;
    }

    public String getBlackIcon() {
        return blackIcon;
    }

}
