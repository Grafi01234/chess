package com.example.chess.Game;

/**
 * Pieces types are stored as constans
 */

public enum Type {
    PAWN("U+2659", "U+265F"),
    KING("U+2654", "U+265A"),
    QUEEN("U+2655", "U+265B\t"),
    KNIGHT("U+2658", "U+265E"),
    ROOK("U+2656", "U+265C"),
    BISHOP("U+2657", "U+265D"),
    EMPTY("", "");

    private final String whiteIcon;
    private final String blackIcon;

    Type(String whiteIcon, String blackIcon) {
        this.whiteIcon = whiteIcon;
        this.blackIcon = blackIcon;
    }

    public String getIcon(Color color) {
        return color == Color.WHITE ? whiteIcon : blackIcon;
    }
}
