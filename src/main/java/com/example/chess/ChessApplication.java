package com.example.chess;

// ctrl + shift + k - wypychasz zmiany
// alt + shift + r - zmiana nazwy
// ctrl + shift + spacja - dokumentacja
// ctrl + / - komentuj wiele linijek kodu

// aktualizacja systemu:
// yay -Syyu

// dodanie wszystkich plikow do gita:
// git add .

// commit:
// git commit -a

// push:
// git push origin HEAD:master

import com.example.chess.Game.Color;
import com.example.chess.Piece.Pawn;
import com.example.chess.Piece.Piece;

/**
 * Pobierasz z konsoli pozycje start i koniec
 * A2 -> A3
 *
 * TODO:
 *  * dodac sprawdzanie czy moze przejsc na pole
 *     * czy pole puste?
 *     * czy kolor inny niz twoj wlasny?
 *     * czy nie wyszed za plansze?
 *  * dodac sprawdzanie czy bije
 *  * wyswietlanie mapy
 *  * przyjmowanie komend
 */
public class ChessApplication {
    public static void main(String[] args) {
        final Piece piece = new Pawn(1, 1, null);
        System.out.println(piece.getType().getIcon(Color.WHITE));
//        System.out.println("Hello world! ♚");
    }


    enum BlaJakoEnum {

        NAZWA_INSTANCJI("testBlaName");

        private final String blaName;

        BlaJakoEnum(String blaName) {
            this.blaName = blaName;
        }
    }

    static class Bla {

        public static final Bla NAZWA_INSTANCJI = new Bla("testBlaName");

        private final String blaName;

        private Bla(String blaName) {
            this.blaName = blaName;
        }
    }
}
