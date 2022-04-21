package HomeWork7;

import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Васька", 35, false);
        cats[1] = new Cat("Мурзик", 25, false);
        cats[2] = new Cat("Симка", 30, false);
        cats[3] = new Cat("Барсик", 50, false);

        Plate plate = new Plate(100);

        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].appetite < plate.food) {
                cats[i].eat(plate);
                cats[i].satiety = true;
                System.out.println(cats[i].name + " поел");
            } else {
                System.out.println(cats[i].name + " не поел");
            }
        }
        plate.info();
        System.out.println();
        action = sc.nextInt();
        plate.addFood(action);
        plate.info();
    }
}
