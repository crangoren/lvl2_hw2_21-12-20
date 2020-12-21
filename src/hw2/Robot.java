package hw2;

public class Robot implements Move {
    private int runDistance;
    private int jumpHeight;
    String name;

    @Override
    public void run() {
        System.out.println("robot run");
    }

    @Override
    public void jump() {
        System.out.println("robot jump");
    }

    @Override
    public void jumpOver(int height) {
        if (height <= jumpHeight) {
            Wall.jump(height, name);

        } else {
            System.out.println(name + " не перепрыгнул стену высотой " + height + "м.");


        }
    }

    @Override
    public void runAround(int distance) {
        if (distance <= runDistance) {
            Road.run(distance, name);

        } else {
            System.out.println(name + " не пробежал дистанцию " + distance + "м.");

        }
    }

    public Robot(int runDistance, int jumpHeight, String name) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }
}
