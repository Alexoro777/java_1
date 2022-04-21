package HomeWork7;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void addFood(int x) {
        this.food += food;
    }

    public void info() {
        System.out.println("[" + food + "]");
    }
}
