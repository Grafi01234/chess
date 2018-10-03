package com.example.chess.Game;

/**
 * Pieces types are stored as constans
 */

public enum Type {
    PAWN("P", "Z"),
    KING("K", ""),
    QUEEN("Q", ""),
    KNIGHT("K", ""),
    ROOK("", ""),
    BISHOP("", "");

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
