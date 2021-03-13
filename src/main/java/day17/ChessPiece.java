package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"), BISHOP_WHITE(3.5, "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"), BISHOP_BLACK(3.5, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟");
    private double value;
    private String name;

    ChessPiece(double value, String name) {
        this.value = value;
        this.name = name;
    }
}
//package day17;
//
//public enum ChessPiece {
//    KING_WHITE(100, "Король (белый) ♔"), QUEEN_WHITE(9, "Ферзь (белый) ♕"), ROOK_WHITE(5, "Ладья (белая) ♖"), BISHOP_WHITE(3.5, "Слон (белый) ♗"), KNIGHT_WHITE(3, "Конь (белый) ♘"), PAWN_WHITE(1, "Пешка (белая) ♙"),
//    KING_BLACK(100, "Король(черный) ♚"), QUEEN_BLACK(9, "Ферзь (черный) ♛"), ROOK_BLACK(5, "Ладья (черная) ♜"), BISHOP_BLACK(3.5, "Слон (черный) ♝"), KNIGHT_BLACK(3, "Конь (черный) ♞"), PAWN_BLACK(1, "Пешка (черная) ♟");
//    private double value;
//    private String name;
//
//    ChessPiece(double value, String name) {
//        this.value = value;
//        this.name = name;
//    }
//}