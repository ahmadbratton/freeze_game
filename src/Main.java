public class Main {

    public static void main(String[] args) {
        GamePiece piece = new GamePiece();

        System.out.println("**** testing if piece moves *****");
        piece.move(2, 3);
        if (piece.positionX == 2 && piece.positionY == 3 ){
            System.out.println("position x is 2 and position y is 3 test passed");
        }else {
            System.out.println("test failed!!");
        }


        System.out.println("**** testing if boolean changes from false to true *****");
        piece.freeze();
        if (piece.isFrozen == true){
            System.out.println("TEST PASSED your piece is frozen ");
        }else {
            System.out.println("not frozen test failed!!");
        }


        System.out.println("**** testing if the piece can move once it has been frozen *****");
        piece.move(5,8);
        if (piece.positionX == 2 && piece.positionY == 3 ){
            System.out.println(" you are Frozen my guy position x is still 2 and position y is still 3 TEST PASSED");
        }else {
            System.out.println("test failed!!");
        }


        System.out.println("**** testing if boolean changes from true to false *****");
        piece.unfreeze();
        if (piece.isFrozen == false){
            System.out.println(" you are no longer frozen you can move");
        }else{
            System.out.println("you are still frozen bruh whats going on, TEST FAILED");
        }


        System.out.println("**** testing if the piece can move once it has been frozen *****");
        piece.move(1,1);
        if (piece.positionX == 1 && piece.positionY == 1 ){
            System.out.println("position x is 1 and position y is 1 test passed");
        }else {
            System.out.println("test failed!!");
        }

        System.out.println("**** testing if the piece can move past the board max parameters  *****");
        piece.move(101,505);
        if (piece.positionX == 100 && piece.positionY == 500){
            System.out.println("you cannot go that far!! position x is 100 and position y is 500 test passed");
        }else {
            System.out.println("test failed!!");
        }

        System.out.println("**** testing if the piece can move past the board min parameters *****");
        piece.move(-1,-7);
        if (piece.positionX == 0 && piece.positionY == 0){
            System.out.println("you cannot go that far!! position x is 0 and position y is 0 test passed");
        }else {
            System.out.println("test failed!!");
        }



    }

}
