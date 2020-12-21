package hw2;

public class Wall implements Obstruction{


    int height;

    public Wall(int height) {

        this.height = height;
    }

    public static void jump(int height, String jumper) {
        System.out.println( jumper + " перепрыгнул стену высотой " + height + " м.");

    }
    public int getHeight() {
        return height;
    }

    @Override
    public int getDistance() {
        return 0;
    }
}
