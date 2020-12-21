package hw2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        DayOfWeek current = DayOfWeek.MONDAY;
        getWorkingHours(current.toString());




        Move human = new Human(300, 1, "vasya");
        Move cat = new Cat(50, 4, "barsik");
        Move robot = new Robot(1500, 0, "r2d2");

        Wall wall1 = new Wall( 1);
        Road road1 = new Road( 300);

        human.jump();
        human.run();
        human.jumpOver(wall1.height);
        human.runAround(road1.distance);


        cat.jump();
        cat.run();
        cat.runAround(road1.distance);
        cat.jumpOver(wall1.height);


        robot.jump();
        robot.run();
        robot.jumpOver(wall1.height);
        robot.runAround(road1.distance);


        Move[] persons = {
                new Cat(10, 2, "pushok"),
                new Human(500, 1, "nikita"),
                new Cat(100, 2, "kisa"),
                new Human(100, 2, "igor"),
                new Robot(500, 5, "bot"),
                new Robot(0, 0, "robofridge")
        };

        Obstruction[] obstructions = {
                new Wall(3),
                new Wall(5),
                new Wall(2),
                new Road(100),
                new Road(500),
                new Road(300),
                new Road(10)
        };

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < obstructions.length; j++) {
                if (obstructions[j].getHeight() > 0) {
                    int height = obstructions[j].getHeight();
                    persons[i].jumpOver(height);



                } else if (obstructions[j].getDistance() > 0) {
                    int distance = obstructions[j].getDistance();
                    persons[i].runAround(distance);

                }

            }

        }

    }
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public static void getWorkingHours(String current) {

        DayOfWeek[] days = DayOfWeek.values();



        for (int i = 0, j = 40; i < days.length; i++, j -= 8) {
            if (current.equals(days[i].toString())) {
                System.out.println("Сегодня " + current + ", осталось работать " + j + " часов\n");
            } else if (current.equals(days[5].toString()) || current.equals(days[6].toString())) {
                System.out.println("сегодня выходной\n");
                return;
            }

        }
    }



}
