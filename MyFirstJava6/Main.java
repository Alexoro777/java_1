public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик",200, 0);
        cat.run(150);
        cat.swim(5);

        Dog dog = new Dog("Барбос", 500, 10);
        dog.run(300);
        dog.swim(12);
    }
}
