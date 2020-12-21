package hw2;

public class Road implements Obstruction{

    int distance;

    public Road(int distance) {

        this.distance = distance;
    }
    public static void run (int distance, String runner) {
        System.out.println(runner + " смог пробежать дистанцию " + distance + " м.");
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}
