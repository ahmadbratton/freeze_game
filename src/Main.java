public class Main {

    public static void main(String[] args) {
        GamePiece piece = new GamePiece();
        piece.move(2, 3);
        piece.freeze();
        piece.move(5,8);
        piece.unfreeze();
        piece.move(1,1);
        piece.move(101,505);
        piece.move(-1,-7);
        piece.move(-1,7);
        piece.move(5,-7);
        piece.move(101,21);
        piece.move(5,505);









    }
}
