abstract class Animal {
    protected  String name;
    protected int runMax;
    protected int swimMax;

    abstract void run(int distance);

    abstract void swim(int distance);


    public Animal(String name, int runMax, int swimMax) {

        this.name = name;
        this.runMax = runMax;
        this.swimMax = swimMax;
    }
}
