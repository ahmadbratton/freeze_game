import java.util.Random;

/**
 * Created by ahmadbratton on 7/18/17.
 */
public class GamePiece {
    int positionX;
    int positionY;
    boolean isFrozen;
    String name;
    String color;
    int minx;
    int miny;
    int maxX;
    int maxy;


    public void move(int newPositionX, int newPositionY){
        if (isFrozen == false){
            if (newPositionX > maxX){
                this.positionX = 100;
                System.out.println("OUT OF BOUNDS!! your piece moved to position X: " + this.positionX);
            }else if (newPositionX < minx){
                this.positionX = 0;
                System.out.println("OUT OF BOUNDS!! your piece moved to position X: " + this.positionX);
            }else{
                this.positionX = newPositionX;
                System.out.println("your piece moved to position X: " + this.positionX);
            }

            if (newPositionY > maxy){
                this.positionY = 500;
                System.out.println("OUT OF BOUNDS!! your piece moved to position y: " + this.positionY);
            }else if (newPositionY < miny){
                this.positionY = 0;
                System.out.println("OUT OF BOUNDS!! your piece moved to position y: " + this.positionY);
            }else{
                this.positionY = newPositionY;
                System.out.println("your piece moved to position y: " + this.positionY);
            }

        }else{
            System.out.println("this piece is frozen and cannot move!");
            System.out.println("the position of your piece is still " + this.positionX + " , " + this.positionY);

        }

    }

    public void move(){
        if (isFrozen == false){
            Random random = new Random();
            this.positionX = random.nextInt(50);
            this.positionY = random.nextInt(50);
            System.out.println("your piece moved to position " + this.positionX + " , " + this.positionY);

        }else{
            System.out.println("this piece is frozen and cannot move!");
            System.out.println("the position of your piece is still " + this.positionX + " , " + this.positionY);

        }
    }

    public void freeze() {
        isFrozen = true;
        System.out.println( "freeze call has made the game piece frozen and unable to move: " + isFrozen);
    }

    public void unfreeze(){
        isFrozen = false;
        System.out.println( "unfreeze call has made the game piece free to move: " + isFrozen);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public int getMinx() {
        return minx;
    }

    public int getMiny() {
        return miny;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxy() {
        return maxy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.isFrozen = false;
        this.name = "king";
        this.color = "black";
        this.maxX = 100;
        this.minx = 0;
        this.maxy = 500;
        this.miny = 0;
    }

}
