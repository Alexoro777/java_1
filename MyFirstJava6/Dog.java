class Dog extends Animal {

    public Dog(String name, int runMax, int swimMax) {
        super(name, runMax, swimMax);
    }

    @Override
    void run(int distance) {
        if ((distance >= 0) && (distance <= runMax)) System.out.println(name + " " + "пробежал дистанцию");
        else System.out.println(name + " " + "устал");
    }

    @Override
    void swim(int distance) {
        if ((distance >= 0) && (distance <= swimMax)) System.out.println(name + " " + "проплыл дистанцию");
        else System.out.println(name + " " + "устал");
    }
}
