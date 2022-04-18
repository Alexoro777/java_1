class Cat extends Animal {

    public Cat(String name, int runMax, int swimMax) {
        super(name, runMax, swimMax);
    }

    @Override
    void run(int distance) {
        if ((distance >= 0) && (distance <= runMax)) System.out.println(name + " " + "пробежал дистанцию");
        else System.out.println(name + " " + "устал");
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " " + "не умеет плавать");
    }
}